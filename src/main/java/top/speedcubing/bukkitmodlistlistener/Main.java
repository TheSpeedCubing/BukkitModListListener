package top.speedcubing.bukkitmodlistlistener;

import org.bukkit.Bukkit;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
    public static Plugin instance;

    @Override
    public void onEnable() {
        instance = this;
        Bukkit.getMessenger().registerIncomingPluginChannel(this, "FML|HS", new MessageListener());
        Bukkit.getMessenger().registerOutgoingPluginChannel(this, "FML|HS");
        Bukkit.getPluginManager().registerEvents(new PlayerJoinListener(), this);
    }
}
