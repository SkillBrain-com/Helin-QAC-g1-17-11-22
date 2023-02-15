package Tema3;

import java.util.Arrays;

class BirdWatcher {
    public static void main(String[] args) {
        int [] birdsPerDay = {2, 5, 0, 7, 4, 1};
        BirdWatcher birdCount = new BirdWatcher(birdsPerDay);

        System.out.println(Arrays.toString(birdCount.getLastWeek()));
        System.out.println(birdCount.getToday());
        birdCount.incrementTodaysCount();
        System.out.println(birdCount.getToday());
        System.out.println(birdCount.hasDayWithoutBirds());
        System.out.println(birdCount.getCountForFirstDays(4));
        System.out.println(birdCount.getBusyDays());
    }
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        int [] array = {0, 2, 5, 3, 7, 8, 4};
        return array;
    }

    public int getToday() {
        return birdsPerDay[birdsPerDay.length - 1];
    }

    public void incrementTodaysCount() {
        birdsPerDay[birdsPerDay.length - 1] ++;
    }

    public boolean hasDayWithoutBirds() {
        boolean withoutbirds = false;
        for (int i = 0; i < birdsPerDay.length; i ++)
            if (birdsPerDay[i] == 0)
                withoutbirds = true;

        if (withoutbirds == true)
            return true;
        else return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int suma = 0;
        for (int i = 0; i < numberOfDays; i ++)
            suma = suma + birdsPerDay[i];
        return suma;
    }

    public int getBusyDays() {
        int zile = 0;

        for (int i = 0; i < birdsPerDay.length; i ++)
            if (birdsPerDay[i] >= 5)
                zile ++;

        return zile;
    }
}
