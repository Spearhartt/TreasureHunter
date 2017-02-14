package com.conquestiamc.utils;

import org.bukkit.Bukkit;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Logger;

/**
 * Created by Spearhartt on 2/12/2017.
 */
public class spLogger {
    private static FileConfiguration config = null;
    private static Logger log = Bukkit.getLogger();
    public static String label = "[TreasureHunter] ";

    public spLogger getLogger(JavaPlugin plugin) {
        config = plugin.getConfig();
        return this;
    }

    public static void info(String message) {
        log.info(label + message);
    }

    public static void debug(String message) {
        if (config.getBoolean("debug")) {
            log.info(label + message);
        }
    }

    public static void severe(String message) {
        log.severe(label + message);
    }
}
