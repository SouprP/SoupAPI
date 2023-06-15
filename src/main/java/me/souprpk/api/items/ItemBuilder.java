package me.souprpk.api.items;

import me.souprpk.api.text.Text;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class ItemBuilder {

    // Display and lore
    private String display = null;
    private List<String> lore = null;

    // Enchants and flags
    private HashMap<Enchantment, Integer> enchants = null;
    private  List<ItemFlag> itemFlags = null;

    // Material and other
    private Material mat = Material.AIR;
    private int amount = 1;
    private Integer customModel = null;
    ////
    private boolean shouldColor = true;

    public ItemBuilder setDisplay(String name){
        if(shouldColor){
            this.display = Text.color(name);
            return this;
        }
        this.display = name;
        return this;
    }

    public ItemBuilder setMaterial(Material mat){
        this.mat = mat;
        return this;
    }

    public ItemBuilder setAmount(int amount){
        this.amount = amount;
        return this;
    }

    public ItemBuilder setLore(List<String> lore){
        if (shouldColor) {
            if(lore == null)
                lore = new ArrayList<>();

            for(String text : lore)
                this.lore.add(Text.color(text));

            return this;
        }
        this.lore = lore;
        return this;
    }

    public ItemBuilder addLore(String line){
        if(this.lore == null)
            this.lore = new ArrayList<>();

        if(shouldColor){
            this.lore.add(Text.color(line));
            return this;
        }
        this.lore.add(line);
        return this;
    }

    public ItemBuilder addEnchant(Enchantment ench, int level){
        if(this.enchants == null)
            this.enchants = new HashMap<>();

        this.enchants.put(ench, level);
        return this;
    }

    public ItemBuilder setEnchants(HashMap<Enchantment, Integer> enchs){
        if(this.enchants == null)
            this.enchants = new HashMap<>();

        this.enchants.putAll(enchs);

        return this;
    }

    public ItemBuilder setFlags(List<ItemFlag> flag){
        if(this.itemFlags == null)
            this.itemFlags = new ArrayList<>();

        this.itemFlags = flag;
        return this;
    }

    public ItemBuilder addFlag(ItemFlag ... flag){
        if(this.itemFlags == null)
            this.itemFlags = new ArrayList<>();

        this.itemFlags.addAll(Arrays.asList(flag));

        return this;
    }

    /*
    * Makes the ItemBuilder apply colors by using ChatColor characters in strings
    * @param value - should color value
    * @return - ItemBuilder
    */
    public ItemBuilder setShouldColor(boolean value){
        this.shouldColor = value;
        return this;
    }

    public ItemBuilder setCustomModelData(int value){
        this.customModel = value;
        return this;
    }


    public ItemStack build(){
        ItemStack item = new ItemStack(mat, amount);
        ItemMeta meta = item.getItemMeta();

        if(display != null)
            meta.setDisplayName(display);

        if(lore != null)
            meta.setLore(lore);

        if(enchants != null)
            for(Enchantment k : enchants.keySet())
                meta.addEnchant(k, enchants.get(k), true);

        if(itemFlags != null)
            for(ItemFlag flag : itemFlags)
                meta.addItemFlags(flag);

        if(customModel != null)
            meta.setCustomModelData(customModel);

        item.setItemMeta(meta);
        return item;
    }

}
