package me.gadriel.listeners;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class PlayerEvent implements Listener {

    @EventHandler
    public void onJoinPlayer(PlayerJoinEvent event) {
        Player player = event.getPlayer();

        event.setJoinMessage("Wow!! " + player.getName() + " joined the server.");
    }

    @EventHandler
    public void onLeavePlayer(PlayerQuitEvent event) {
        Player player = event.getPlayer();

        event.setQuitMessage("Sad... " + player.getName() + " leave the server.");
    }
}
