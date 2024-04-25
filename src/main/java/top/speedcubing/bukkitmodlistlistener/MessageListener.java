package top.speedcubing.bukkitmodlistlistener;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.bukkit.entity.Player;
import org.bukkit.plugin.messaging.PluginMessageListener;

public class MessageListener implements PluginMessageListener {
    @Override
    public void onPluginMessageReceived(String s, Player player, byte[] bytes) {
        List<String[]> modList = new ArrayList<>();
        if (bytes.length != 2) {
            boolean store = false;
            String name = null, str;
            for (int i = 2; i < bytes.length; store = !store) {
                int end = i + bytes[i] + 1;
                str = new String(Arrays.copyOfRange(bytes, i + 1, end));
                if (store) {
                    modList.add(new String[]{name, str}); //mod name and mod version
                } else name = str;
                i = end;
            }
            for (String[] m : modList) {
                System.out.println(m[0] + " " + m[1]);
            }
        }
    }
}
