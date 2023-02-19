package me.gadriel;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
    @Override
    public void onEnable() {
        System.out.println("[MyFirstPlugin] Plugin is Started!");
    }

    @Override
    public void onDisable() {
        System.out.println("[MyFirstPlugin] Plugin is Stopped!");
    }
}
