package org.skillbrain.andaDarjan;

public class Tema2Lasagna {
    public static void main(String[] args) {
        System.out.println("Minutes in oven = " + minutesInOven());
        System.out.println("Minutes remaining = " + minutesRemainingInOven(30));
        System.out.println("Time to preapare 2 layers = " + preparationTimeInMinutes(2));
        System.out.println("Total preparation time = " + totalTimeInMinutes(3,20));
    }

    static int minutesInOven() {
        return 40;
    }
    static int minutesRemainingInOven(int minutesInOven) {
        return minutesInOven() - minutesInOven;
    }
    static int preparationTimeInMinutes(int layers) {
        return 2 * layers;
    }
    static int totalTimeInMinutes(int layer, int timeInOven) {
        return preparationTimeInMinutes(layer) + minutesRemainingInOven(timeInOven);
    }

}
