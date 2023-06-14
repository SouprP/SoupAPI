package me.souprpk.api.world;

import org.bukkit.Chunk;
import org.bukkit.World;

public class WorldGen {

    /**
     * Generates world chunks in a provided radius
     * @param world - world to generate the chunks in
     * @param radius - radius (box) in which the chunks will be generated
     */
    public void generateChunks(World world, int radius){
        for(int x = -radius; x <= radius; x++)
            for(int y = -radius; y <= radius; y++){
                Chunk chunk = world.getChunkAt(x, y);
                if(!chunk.isGenerated())
                    chunk.load(true);
            }
    }
}
