package com.conquestiamc;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.scheduler.BukkitRunnable;

import java.util.HashMap;

/**
 * Created by Spearhartt on 2/14/2017.
 */
public class TreasureSpawner extends BukkitRunnable {

    public HashMap<Integer, Treasure> treasures = new HashMap<>();
    private FileConfiguration config = TreasureHunter.config.getConfig();

    @Override
    public void run() {
        if(!maxTreasureSpawned()) {
            
        }
    }

    public boolean maxTreasureSpawned() {
        if(treasures.size() >= config.getInt("MaxTreasures")) {
            return true;
        }
        return false;
    }
}
