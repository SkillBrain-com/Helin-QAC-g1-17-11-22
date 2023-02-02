package org.skillbrain.cristianLuca.Tema3;

import java.util.Arrays;

public class Main5 {
    public static void main(String[] args) {
        int[] birdsPerDay = {1, 5, 0, 3, 8 ,4};
        BirdWatcher birdWatcher = new BirdWatcher(birdsPerDay);
        System.out.println(Arrays.toString(birdWatcher.getLastWeek()));
        System.out.println(birdWatcher.getBusyDays());
        System.out.println(birdWatcher.getCountForFirstDays(3));
        System.out.println(birdWatcher.incrementTodaysCount());
        System.out.println(birdWatcher.getToday());
        System.out.println(birdWatcher.hasDayWithoutBirds());
    }
}