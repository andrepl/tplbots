package tpl;

import battlecode.common.Direction;
import battlecode.common.MapLocation;

import java.util.Random;

public class Util {

    public static Random rnd = new Random();

    public static void shuffleDirectionArray(Direction[] ar) {

        for (int i = ar.length - 1; i > 0; i --) {
            int index = rnd.nextInt(i + 1);
            // Simple swap
            Direction a = ar[index];
            ar[index] = ar[i];
            ar[i] = a;
        }
    }


    public static int mapLocationToInt(MapLocation loc) {
        return ((((short) loc.x) << 16) | ((short)loc.y) & 0xFFFF);
    }

    public static MapLocation intToMapLocation(int loc) {
        return new MapLocation(loc >>> 16, loc & 0xFFFF);
    }

    public static int roll(int max) {
        return (int) Math.floor(Math.random() * max);
    }

}
