package org.skillbrain.iulianaOlaru.Tema1.Tema

public class Bird_loop {

    public static void main(String[] args) {

        int [] birdsThisWeek = {2, 0, 5, 3, 7, 8, 4};

        getLastWeek(birdsThisWeek);
        System.out.println("Today = " + getToday(birdsThisWeek));

        // System.out.println("Today's increment is = " + incrementToday(birdsThisWeek));

        System.out.println("Days without birds = " + daysWithoutBirds(birdsThisWeek));

        System.out.println("Sum for three days = " + getCoutForFirstDays(birdsThisWeek, 3));

        System.out.println("Busy days = " + getBusyDays(birdsThisWeek));

    }


    static int getBusyDays(int [] birdArray) {
        int busyDays = 0;
        for (int i = 0; i < birdArray.length; i++) {
            if (birdArray[i] >= 5){
                ++busyDays;
            }
        }
        return busyDays;
    }

    static int getCoutForFirstDays(int[] birdArray, int days) {
        int suma = 0;
        for (int i = 0; i < days; i++) {
        suma += birdArray[i];
        }
        return suma;
    }
    static void getLastWeek(int [] birdArray) {
        for (int bird : birdArray) {
            System.out.print(bird + " ");
        }
        System.out.println();
    }

    static int getToday(int [] birdArray) {
        return birdArray[birdArray.length - 1];
    }

    static int incrementToday(int [] birdArray) {
        return ++birdArray[birdArray.length-1];
    }

    static boolean daysWithoutBirds(int[] birdArray) {
        for (int i = 0; i < birdArray.length; i++) {
            if(birdArray[i] == 0){
                return true;
            }
        }
        return false;
    }

}
