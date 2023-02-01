package org.skillbrain.danielIrimia.Tema3;

import java.util.Arrays;

// Instructions:
//You're an avid bird watcher that keeps track of how many birds have visited your garden in the last seven days.
//You have six tasks, all dealing with the numbers of birds that visited your garden.
public class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public static void main(String[] args) {

        // 1. Check what the counts were last week
        // For comparison purposes, you always keep a copy of last week's counts nearby, which were:
        // 0, 2, 5, 3, 7, 8 and 4. Implement the BirdWatcher.getLastWeek() method that returns last week's counts:

        int[] birdsPerDay = {0, 2, 5, 3, 7, 8, 4};
        BirdWatcher birdCount = new BirdWatcher(birdsPerDay);
        System.out.println("1.=====================================");
        System.out.println("Last week's counts: " + Arrays.toString(birdCount.getLastWeek()));

        // 2. Check how many birds visited today
        // Implement the BirdWatcher.getToday() method to return how many birds visited your garden today.
        // The bird counts are ordered by day, with the first element being the count of the oldest day,
        // and the last element being today's count.

        System.out.println("2.=====================================");
        System.out.println("Today's count: " + birdCount.getToday());

        // 3. Increment today's count
        // Implement the BirdWatcher.incrementToday'sCount() method to increment today's count:
        birdCount.incrementTodayCount();
        System.out.println("3.=====================================");
        System.out.println("Increment today count: " + birdCount.getToday());

        // 4. Check if there was a day with no visiting birds
        // Implement the BirdWatcher.hasDayWithoutBirds() method that returns true if there was a day at which zero
        // birds visited the garden; otherwise, return false:
        System.out.println("4.=====================================");
        System.out.println("Has day without birds: " + birdCount.hasDayWithoutBirds());

        // 5. Calculate the number of visiting birds for the first number of days
        // Implement the BirdWatcher.getCountForFirstDays() method that returns the number of birds that have visited
        // your garden from the start of the week, but limit the count to the specified number of days
        // from the start of the week.

        System.out.println("5.=====================================");
        System.out.println("Birds count for first 4 days: " + birdCount.getCountForFirstDays(4));

        // 6. Calculate the number of busy days
        // Some days are busier that others. A busy day is one where five or more birds have visited your garden.
        // Implement the BirdWatcher.getBusyDays() method to return the number of busy days:

        System.out.println("6.=====================================");
        int[] birdsPerDay2 = {2, 5, 0, 7, 4, 1};
        BirdWatcher birdCount2 = new BirdWatcher(birdsPerDay2);
        System.out.println("Busy days: " + birdCount2.getBusyDays());

    }

    public int[] getLastWeek() {
        return birdsPerDay;
    }

    public int getToday() {
        return birdsPerDay[birdsPerDay.length - 1];
    }

    public void incrementTodayCount() {
        birdsPerDay[birdsPerDay.length - 1]++;
    }

    public boolean hasDayWithoutBirds() {
        for (int birds : birdsPerDay) {
            if (birds == 0) {
                return true;
            }
        }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int count = 0;
        for (int i = 0; i < numberOfDays; i++) {
            count += birdsPerDay[i];
        }
        return count;
    }

    public int getBusyDays() {
        int busyDays = 0;
        for (int birds : birdsPerDay) {
            if (birds >= 5) {
                busyDays++;
            }
        }
        return busyDays;
    }
}
