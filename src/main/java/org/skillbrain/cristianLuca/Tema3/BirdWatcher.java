package org.skillbrain.cristianLuca.Tema3;

class BirdWatcher {
    private int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay;
    }

    public int[] getLastWeek() {
        return birdsPerDay;
    }

    public int getToday() {
        if (birdsPerDay.length == 0) {
            return 0;
        }
        return birdsPerDay[birdsPerDay.length - 1];
    }

    public int incrementTodaysCount() {
        return ++birdsPerDay[birdsPerDay.length - 1];
    }

    public boolean hasDayWithoutBirds() {
        for (int bird : birdsPerDay) {
            if (bird == 0) {
                return true;
            }
        }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        if (numberOfDays >= 7) {
            numberOfDays = 7;
        }
        int sum = 0;
        for (int i = 0; i < numberOfDays; i++) {
            sum += birdsPerDay[i];
        }
        return sum;
    }

    public int getBusyDays() {
        int pos = 0;
        for (int j : birdsPerDay) {
            if (j >= 5) {
                pos++;
            }
        }
        return pos;
    }
}