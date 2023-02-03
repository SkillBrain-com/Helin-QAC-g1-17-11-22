package org.skillbrain.cristianLuca.Tema2.Tema2optionalLasagna;

public class Main {
    public static void main(String[] args) {
        Lasagna lasagna = new Lasagna();
        System.out.println(lasagna.expectedMinutesInOven()); //40
        System.out.println(lasagna.remainingMinutesInOven(30)); //10
        System.out.println(lasagna.preparationTimeInMinutes(2)); //4
        System.out.println(lasagna.totalTimeInMinutes(3, 20)); //26
    }
}