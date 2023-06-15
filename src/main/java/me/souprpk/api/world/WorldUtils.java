package me.souprpk.api.world;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.configuration.Configuration;

public class WorldUtils {

    public static Location getConfigLoc(Configuration config, String path){
        return new Location(
                Bukkit.getWorld(config.getString(path + ".world")),
                config.getDouble(path + ".x"),
                config.getDouble(path + ".y"),
                config.getDouble(path + ".z")
        );
    }

    public WorldUtils(){
        throw new UnsupportedOperationException("This class cannot be instantiated");
    }
}
