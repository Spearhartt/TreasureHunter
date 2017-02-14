package com.conquestiamc.listeners;

import com.conquestiamc.TreasureFinder;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;

/**
 * Created by Spearhartt on 2/14/2017.
 */
public class FinderListener implements Listener {
    private ItemStack finderItem = TreasureFinder.finderItem;

    @EventHandler
    public void onPlayerInteractEvent (PlayerInteractEvent event) {
        if (event.getPlayer().getInventory().getItemInMainHand().getType().equals(finderItem.getType())) {
            /** TODO: Report nearest treasure */
        }
    }
}
