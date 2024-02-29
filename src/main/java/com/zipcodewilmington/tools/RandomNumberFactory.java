package com.zipcodewilmington.tools;
import java.awt.*;
import java.util.*;

/**
 * Created by Leon on 2/4/2017.
 */

public abstract class RandomNumberFactory {
    private static final Random random = new Random();

    /** @return a random float between the specified min and max numeric range */
    public static Float createFloat(float min, float max) {
        return random.nextFloat() * (max - min) + min;
    }

    /** @return a random integer between the specified min and max numeric range */
    public static Integer createInteger(Integer min, Integer max) {
        return createFloat(min, max).intValue();
    }
    public static Integer createRandomAreaCode(){
        Integer a = createInteger(1, 9);
        Integer b = createInteger(1, 9);
        Integer c = createInteger(1, 9);
        String abc = a.toString() + b.toString() + c.toString();
        return Integer.parseInt(abc);
    }
    public static Integer createRandomCentralOfficeCode(){
        Integer a = createInteger(3, 9);
        Integer b = createInteger(1 ,9);
        Integer c = createInteger(1 ,9);
        String abc = a.toString() + b.toString() + c.toString();
        return Integer.parseInt(abc);
    }
    public static Integer createRandomPhoneLineCode(){
        Integer a = createInteger(1, 9);
        Integer b = createInteger(1, 9);
        Integer c = createInteger(1, 9);
        Integer d = createInteger(1 ,9);
        String abcd = a.toString() + b.toString() + c.toString() + d.toString();
        return Integer.parseInt(abcd);
    }
}