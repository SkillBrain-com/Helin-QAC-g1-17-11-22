package org.skillbrain.alexandraNegulescu.Tema_2;

public class BirdWatcher {

    public static void main(String[] args) {

        System.out.println("Birds last week: " + getLastWeek());
        System.out.println("Birds today: " + getToday());
        System.out.println("Increment today count " + incrementTodaysCount());
        System.out.println("Days without birds: " + hasDayWithoutBirds());
        System.out.println("Birds in the first few days: " + getCountForFirstDays());
        System.out.println("Number of busy days: " + getBusyDays());

    }

    static int [] getLastWeek(){

        int [] lastWeek = {0, 2, 5, 3, 7, 8, 4};
        return lastWeek;

    }

    static int getToday(){

        int[] birdsPerDay = { 2, 5, 0, 7, 4, 1 };
        return birdsPerDay[birdsPerDay.length-1];


    }

    static int incrementTodaysCount(){

        int[] birdsPerDay = { 2, 5, 0, 7, 4, 1 };
        birdsPerDay[birdsPerDay.length-1]++;
        return birdsPerDay[birdsPerDay.length-1];

    }

    static boolean hasDayWithoutBirds(){

        int[] birdsPerDay = { 2, 5, 0, 7, 4, 1 };
        for (int i = 0 ; i < birdsPerDay.length ; i++)
            if(birdsPerDay[i]==0)
                return true;
        return false;

    }

    static int getCountForFirstDays(){

        int[] birdsPerDay = { 2, 5, 0, 7, 4, 1 };
        int primeleZile = 4;
        int sum = 0;
        for(int i=0; i < primeleZile; i++)
            sum += birdsPerDay[i];
        return sum;

    }

    static int getBusyDays(){

        int[] birdsPerDay = { 2, 5, 0, 7, 4, 1 };
        int busydays = 0;
        for(int i = 0; i < birdsPerDay.length; i++)
            if(birdsPerDay[i] >= 5)
                busydays++;
        return busydays;
    }

}

