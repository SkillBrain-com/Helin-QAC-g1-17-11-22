package org.skillbrain.crinaSas.JavaBasics2;

public class Lasagna {
    public Lasagna() {
    }

    public static void main(String[] args) {
        System.out.println("Minutes in oven = " + minutesInOven() + " min");
        System.out.println("Minutes remaining = " + remainingMinutesInOven(30) + " min ");
        System.out.println("Time to prepare 2 layers = " + preparationTimeInMinutes(2) + "min");
        System.out.println("Total preparation time = " + totalTimeInMinutes(3, 20));
    }

    static int totalTimeInMinutes(int layer, int timeInOven) {
        return preparationTimeInMinutes(layer) + remainingMinutesInOven(timeInOven);
    }

    static int preparationTimeInMinutes(int layers) {
        return 2 * layers;
    }

    static int remainingMinutesInOven(int minutesInOven) {
        return minutesInOven() - minutesInOven;
    }

    static int minutesInOven() {
        return 40;
    }
}
