package org.skillbrain.cristianLuca.Tema2.Tema2optionalLasagna;

public class Lasagna {

    public static int expectedMinutesInOven() {
        return 40;
    }


    public static int remainingMinutesInOven(int minuteInCuptor) {
        int expMinInOven = expectedMinutesInOven();
        return expMinInOven - minuteInCuptor;
    }


    public static int preparationTimeInMinutes(int layers) {
        return 2 * layers;
    }


    public static int totalTimeInMinutes(int layers, int minute) {
        return 2 * layers + minute;

    }
}
