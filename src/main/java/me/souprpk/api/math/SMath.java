package me.souprpk.api.math;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class SMath {

    private final static double PI = 3.141592653589;
    private final static double EULER = 2.71828182845;

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

}
