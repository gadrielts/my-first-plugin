package me.gadriel;

import me.gadriel.listeners.PlayerEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
    @Override
    public void onEnable() {
        System.out.println("[MyFirstPlugin] Plugin is Started!");

        getServer().getPluginManager().registerEvents(new PlayerEvent(), this);
    }

    @Override
    public void onDisable() {
        System.out.println("[MyFirstPlugin] Plugin is Stopped!");
    }
}
