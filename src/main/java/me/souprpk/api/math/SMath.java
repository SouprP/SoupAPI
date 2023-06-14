package me.souprpk.api.math;

public class SMath {

    private final static double PI = 3.141592653589;
    private final static double EULER = 2.71828182845;

    public static double radToDeg(float rad){
        return rad *  180 / PI;
    }

    public static double degToRad(float deg){
        return deg * PI / 180;
    }

    

}
