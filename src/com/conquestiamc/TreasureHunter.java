package com.conquestiamc;

import com.conquestiamc.command.CommandHandler;
import com.conquestiamc.config.Config;
import com.conquestiamc.listeners.FinderListener;
import com.conquestiamc.utils.spLogger;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * Created by Spearhartt on 2/14/2017.
 */
public class TreasureHunter extends JavaPlugin {

    public static Plugin plugin = null;
    public static Config config = null;
    public static spLogger log = null;

    public void onEnable() {
        plugin = this;

        //Load Configuration
        config = new Config(this, "config");

        //Load Logger
        log.getLogger(this);

        //Register Commands
        this.getCommand("th").setExecutor(new CommandHandler());

        //Register Listeners
        getServer().getPluginManager().registerEvents(new FinderListener(), this);

        /** TODO: Vault Economy Check */
    }

    public void onDisable() {

    }
}
