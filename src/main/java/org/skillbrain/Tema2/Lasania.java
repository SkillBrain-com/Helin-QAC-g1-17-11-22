package org.skillbrain.Tema2;

public class Lasania {

    public static void main(String[] args) {
        Lasania lasania = new Lasania();
        lasania.expectedMinutesInOven();
        System.out.println(lasania.expectedMinutesInOven());
        lasania.remainingMinutesInOven(30);
        System.out.println(lasania.remainingMinutesInOven(30));
        lasania.preparationTimeInMinutes(2);
        System.out.println(lasania.preparationTimeInMinutes(2));
        lasania.totalTimeInMinutes(20, 3);
        System.out.println(lasania.totalTimeInMinutes(20, 3));

    }
    public static int expectedMinutesInOven() {
        return 40;
    }

    public static int remainingMinutesInOven(int MinutesInOven) {
        int expectedMinutes = expectedMinutesInOven();
        return expectedMinutes - MinutesInOven;

    }

    public static int preparationTimeInMinutes(int layers) {
        return 2 * layers;
    }

    public static int totalTimeInMinutes(int minute, int layers) {
        return preparationTimeInMinutes(layers) + minute;
    }



}

