package top.speedcubing.bukkitmodlistlistener;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class PlayerJoinListener implements Listener {
    @EventHandler
    public void onJoin(PlayerJoinEvent e) {

        Bukkit.getScheduler().scheduleSyncDelayedTask(Main.instance, () -> {
            Player player = e.getPlayer();
            player.sendPluginMessage(Main.instance, "FML|HS", new byte[]{-2, 0});
            player.sendPluginMessage(Main.instance, "FML|HS", new byte[]{0, 2, 0, 0, 0, 0});
            player.sendPluginMessage(Main.instance, "FML|HS", new byte[]{2, 0, 0, 0, 0});
        }, 20);
    }
}
