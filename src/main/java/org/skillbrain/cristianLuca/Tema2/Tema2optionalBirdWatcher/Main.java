package org.skillbrain.cristianLuca.Tema2.Tema2optionalBirdWatcher;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(BirdWatcher.getLastWeek())); // return [0, 2, 5, 3, 7, 8, 4]

//        int[] birdsPerDay = { 2, 5, 0, 7, 4, 1 };
//        BirdWatcher birdCount = new BirdWatcher(birdsPerDay);
//        System.out.println( birdCount.getToday()); // return 1

//        int[] birdsPerDay = { 2, 5, 0, 7, 4, 1 };
//        BirdWatcher birdCount = new BirdWatcher(birdsPerDay);
//        birdCount.incrementTodaysCount();
//        System.out.println(birdCount.getToday()); //return 2

//        int[] birdsPerDay = { 2, 5, 0, 7, 4, 1 };
//        BirdWatcher birdCount = new BirdWatcher(birdsPerDay);
//        System.out.println(birdCount.hasDayWithoutBirds()); //return true
//
//        int[] birdsPerDay = { 2, 5, 0, 7, 4, 1 };
//        BirdWatcher birdCount = new BirdWatcher(birdsPerDay);
//        System.out.println( birdCount.getCountForFirstDays(4)); //return 14

        int[] birdsPerDay = { 2, 5, 0, 7, 4, 1 };
        BirdWatcher birdCount = new BirdWatcher(birdsPerDay);
        System.out.println( birdCount.getBusyDays()); //return 2
    }
}