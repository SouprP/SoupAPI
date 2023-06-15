package me.souprpk.api.text;

import org.bukkit.ChatColor;

public class Text {

    public static String color(String text){
        return ChatColor.translateAlternateColorCodes('&', text);
    }

    public static String stripColor(String text){
        return ChatColor.stripColor(text);
    }

}
