package com.conquestiamc;

import org.bukkit.Location;
import org.bukkit.inventory.ItemStack;

import java.util.ArrayList;

/**
 * Created by Spearhartt on 2/14/2017.
 */
public class Treasure {

    public Location loc = null;
    public ArrayList<ItemStack> items = new ArrayList<>();
    public double money = 0.0;

    public void setLocation(Location loc) {
        this.loc = loc;
    }

    public Location getLocation() {
        return this.loc;
    }

    /**Adds item to treasure
     *
     * @param item
     */
    public void addItem(ItemStack item) {
        items.add(item);
    }

    /**Removes items from treasure
     *
     * @param item
     */
    public void removeItem(ItemStack item) {
        items.remove(item);
    }

    /**Gets all items in treasure
     *
     * @return
     */
    public ArrayList<ItemStack> getItems() {
        return this.items;
    }

    /**Adds money to treasure
     *
     * @param d
     */
    public void addMoney(double d) {
        money = money + d;
        if (money < 0) {
            money = 0;
        }
    }

    /**Removes money from treasure
     *
     * @param d
     */
    public void removeMoney(double d) {
        money = money - d;
        if (money < 0) {
            money = 0;
        }
    }

    /**Sets money of treasure
     *
     * @param d
     */
    public void setMoney(double d) {
        money = d;
        if (money < 0) {
            money = 0;
        }
    }

    /**Gets money of treasure
     *
     * @return
     */
    public double getMoney() {
        return this.money;
    }

    /**Gets treasure
     *
     * @return
     */
    public Treasure getTreasure() {
        return this;
    }
}
