package org.ibear.free;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.CommandMap;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;


public final class Free extends JavaPlugin implements Listener {

    public static ChatColor CC;


    String name = this.getDescription().getName();
    String version = this.getDescription().getVersion();

    @Override
    public void onEnable() {
        getLogger().info(name + "v" + version +" Enabled!");
        Bukkit.getServer().getPluginManager().registerEvents(new FreeCommand(), this);

        CommandMap commandMap = Bukkit.getCommandMap();
        commandMap.register("free", new FreeCommand());

    }


    @Override
    public void onDisable() {
        getLogger().info(name + "v" + version + " Disabled!");
    }
}
