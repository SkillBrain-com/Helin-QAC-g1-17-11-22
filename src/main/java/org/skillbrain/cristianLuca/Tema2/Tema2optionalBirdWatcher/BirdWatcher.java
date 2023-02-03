package org.skillbrain.cristianLuca.Tema2.Tema2optionalBirdWatcher;

public class BirdWatcher {
    private int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public static int[] getLastWeek() {
        int[] arr = {0, 2, 5, 3, 7, 8, 4};
        return arr;
        //throw new UnsupportedOperationException("Please implement the BirdCount.getLastWeek() method");
    }

    public int getToday() {
        if (this.birdsPerDay.length == 0) {
            return 0;
        }
        return this.birdsPerDay[this.birdsPerDay.length - 1];
        //throw new UnsupportedOperationException("Please implement the BirdCount.getToday() method");
    }

    public void incrementTodaysCount() {
        this.birdsPerDay[this.birdsPerDay.length - 1]++;
        //throw new UnsupportedOperationException("Please implement the BirdCount.incrementTodaysCount() method");
    }

    public boolean hasDayWithoutBirds() {
        for (int element : this.birdsPerDay) {
            if (element == 0)
                return true;
        }
        return false;
        //throw new UnsupportedOperationException("Please implement the BirdCount.hasDayWithoutBirds() method")
    }

    public int getCountForFirstDays(int numOfDays) {
        int sum = 0;
        int nLimit = (numOfDays < 8) ? numOfDays : 7;
        for (int i = 0; i < nLimit; i++) {
            sum += this.birdsPerDay[i];
        }
        return sum;
        //throw new UnsupportedOperationException("Please implement the BirdCount.getCountForFirstDays() method");
    }

    public int getBusyDays() {
        int contor = 0;
        for (int element : this.birdsPerDay) {
            if (element >= 5)
                contor++;
        }
        return contor;
        //throw new UnsupportedOperationException("Please implement the BirdCount.getBusyDays() method");
    }

}

