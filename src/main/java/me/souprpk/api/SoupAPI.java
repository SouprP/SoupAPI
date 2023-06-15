package me.souprpk.api;

import org.bukkit.plugin.java.JavaPlugin;

public final class SoupAPI {

    private JavaPlugin provider;

    public JavaPlugin getProvider(){
        return this.provider;
    }

    public void setProvider(JavaPlugin plugin){
        this.provider = plugin;
    }
}
