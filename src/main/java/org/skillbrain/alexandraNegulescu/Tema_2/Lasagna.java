package org.skillbrain.alexandraNegulescu.Tema_2;

public class Lasagna {

    public static void main(String[] args) {
        Lasagna lasagna = new Lasagna();
        lasagna.expectedMinutesInOven();
        System.out.println(lasagna.expectedMinutesInOven());
        lasagna.remainingMinutesInOven(30);
        System.out.println(lasagna.remainingMinutesInOven(30));
        lasagna.preparationTimeInMinutes(2);
        System.out.println(lasagna.preparationTimeInMinutes(2));
        lasagna.totalTimeInMinutes(20, 3);
        System.out.println(lasagna.totalTimeInMinutes(20, 3));

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