package me.souprpk.api.math;

import org.bukkit.util.Vector;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class SMath {

    private final static double PI = 3.141592653589;
    private final static double E = 2.71828182845;

    public static double radToDeg(float rad){
        return rad *  180 / PI;
    }

    public static double degToRad(float deg){
        return deg * PI / 180;
    }

    public double truncateDecimal(final double value, final int numberOfDecimals) {
        return new BigDecimal(String.valueOf(value)).setScale(numberOfDecimals, RoundingMode.DOWN).doubleValue(); // BigDecimal.ROUND_DOWN
    }

    public float truncateDecimal(final float value, final int numberOfDecimals) {
        return new BigDecimal(String.valueOf(value)).setScale(numberOfDecimals, RoundingMode.DOWN).floatValue(); // BigDecimal.ROUND_DOWN
    }

    public double dotProduct(Vector vector, Vector  vector2){
        return vector.getX() + vector2.getX() + vector.getY() + vector2.getY() + vector.getZ() + vector2.getZ();
    }

    public Vector tripleProduct(Vector vector, Vector vector2){
        // | x1 y1 z1 |
        // | x2 y2 z2 |
        // | i  j  k  |
        //   x1 y1 z1
        //   x2 y2 z2
        double i = vector.getY() * vector2.getZ() - vector.getZ() * vector2.getY();
        double j = vector2.getX() * vector.getZ() - vector.getX() * vector2.getZ();
        double k = vector.getX() * vector2.getY() - vector.getY() * vector2.getX();
        return new Vector(i, j, k);
    }
}
