package com.conquestiamc;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

/**
 * Created by Spearhartt on 2/14/2017.
 */
public class TreasureFinder {

    /** TODO: Get item from config */
    public static ItemStack finderItem = new ItemStack(Material.ROTTEN_FLESH);

    public ItemStack getItem() {
        return finderItem;
    }
}
