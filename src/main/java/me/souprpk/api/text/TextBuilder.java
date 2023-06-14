package me.souprpk.api.text;

import org.bukkit.ChatColor;

public class TextBuilder {

    private String text = "";
    public TextBuilder color(String text){
        this.text =  ChatColor.translateAlternateColorCodes('&', text);
        return this;
    }

    public TextBuilder stripColor(String text){
        this.text =  ChatColor.stripColor(text);
        return this;
    }

    public String build(){
        return this.text;
    }
}
