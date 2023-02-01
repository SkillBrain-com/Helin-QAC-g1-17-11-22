package org.skillbrain.danielIrimia.Tema2;

public class BirdsWatcher {
    public static void main(String[] args) {

        //1. Check what the counts were last week
        int [] birdsThisWeek = {0, 2, 5, 3, 7, 8, 4};
        getLastWeek(birdsThisWeek);

        //2. Check how many birds visited today
        int[] birdsPerDay = { 2, 5, 0, 7, 4, 1 };
        System.out.println(getToday(birdsPerDay));

        //3. Increment today's count
        System.out.println(incrementTodayCount(birdsPerDay));

        //4. Check if there was a day with no visiting birds
        System.out.println(hasDayWithoutBirds(birdsPerDay));

        //5. Calculate the number of visiting birds for the first number of days
        System.out.println(getCountForFirstDays(4,birdsPerDay));

        //6. Calculate the number of busy days
        System.out.println(getBusyDays(birdsPerDay));
    }

    static void getLastWeek( int[] array) {
        for (int i = 0; i < array.length; i++) {
            if ( i == 0 ) {
                System.out.print("[" + array[i] + ", ");
                continue;
            }
            if (i == array.length -1) {
                System.out.print(array[i] + "]");
                System.out.println();
                break;
            }
            System.out.print(array[i] + ", ");
        }
    }

    static int getToday(int[] array) {
        return array[array.length -1];
    }

    static int incrementTodayCount(int[] array) {
        int count = getToday(array);
        return ++count;
    }

    static boolean hasDayWithoutBirds(int[] array){
        for (int bird: array) {
            if(bird == 0) {
                return true;
            }
        }
        return false;
    }

    static int getCountForFirstDays(int days, int[] array) {
        int count = 0;
        for (int i = 0; i < days; i++) {
            count += array[i];
        }
        return count;
    }

    static int getBusyDays(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length ; i++) {
           if (array[i] >= 5) {
               count++;
           }
        }
        return count;
    }
}
