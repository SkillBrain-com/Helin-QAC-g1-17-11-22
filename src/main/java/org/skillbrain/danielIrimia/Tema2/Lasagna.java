package org.skillbrain.danielIrimia.Tema2;

public class Lasagna {

    public static void main(String[] args) {
        System.out.println(expectedMinutesInOven()); // OK
        System.out.println(remainingMinutesInOven(30)); // OK
        System.out.println(preparationTimeInMinutes(2)); // OK
        System.out.println(totalTimeInMinutes(3,20)); // OK
    }
    public static int expectedMinutesInOven(){
        return 40;
    }

    public static int remainingMinutesInOven(int minuteInCuptor) {
        return expectedMinutesInOven() - minuteInCuptor;
    }

    public static int preparationTimeInMinutes(int layers){
        return layers * 2;
    }

    public static int totalTimeInMinutes(int minute, int layers){
        return preparationTimeInMinutes(minute) + layers;
    }
}


