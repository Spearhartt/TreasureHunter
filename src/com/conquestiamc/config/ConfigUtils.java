package com.conquestiamc.config;

import com.conquestiamc.TreasureHunter;
import com.conquestiamc.utils.spLogger;
import org.bukkit.Material;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.inventory.ItemStack;

/**
 * Created by Spearhartt on 2/14/2017.
 */
public class ConfigUtils {

    private static FileConfiguration config = TreasureHunter.config.getConfig();

    public static spLogger log = TreasureHunter.log;
    public static ItemStack finderItem = new ItemStack(getItemMaterial(config.get("FinderItemType")), config.getInt("FinderItemAmount"));

    public static Material getItemMaterial(Object obj) {
        String matName = obj.toString();

        for (Material material : Material.values()) {
            if (material.name().equalsIgnoreCase(matName)) {
                return material;
            }
        }

        log.severe("FinderItemType is not a valid Material!");
        return null;
    }
}
