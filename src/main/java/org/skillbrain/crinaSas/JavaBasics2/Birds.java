package org.skillbrain.crinaSas.JavaBasics2;

public class Birds {
    public Birds() {
    }

    public static void main(String[] args) {
        int[] birdsThisWeek = new int[]{2, 0, 5, 3, 7, 8, 4};
        getLastWeek(birdsThisWeek);
        System.out.println(getToday(birdsThisWeek));
        System.out.println("Today's increment = " + incrementToday(birdsThisWeek));
        System.out.println("Days without birds?" + daysWithoutBirds(birdsThisWeek));
        System.out.println(" Sum for three days = " + getConutForFirstDays(birdsThisWeek, 3));
        System.out.println("Busy days =" + getBusyDays(birdsThisWeek));
    }

    static void getLastWeek(int[] birdArray) {
        int[] var1 = birdArray;
        int var2 = birdArray.length;

        for(int var3 = 0; var3 < var2; ++var3) {
            int bird = var1[var3];
            System.out.print("" + bird + " ");
        }

        System.out.println();
    }

    static int countBirdsLastWeek(int[] birdArray) {
        int count = 0;
        int[] var2 = birdArray;
        int var3 = birdArray.length;

        for(int var4 = 0; var4 < var3; ++var4) {
            int number = var2[var4];
            count += number;
        }

        System.out.println("Count: " + count);
        return count;
    }

    static int getToday(int[] birdArray) {
        return birdArray != null && birdArray.length > 0 ? birdArray[birdArray.length - 1] : 0;
    }

    static int incrementToday(int[] birdArray) {
        return ++birdArray[birdArray.length - 1];
    }

    static boolean daysWithoutBirds(int[] birdArray) {
        for(int i = 0; i < birdArray.length; ++i) {
            if (birdArray[i] == 0) {
                return true;
            }
        }

        return false;
    }

    static int getConutForFirstDays(int[] birdsArray, int days) {
        int sum = 0;

        for(int i = 0; i < days; ++i) {
            sum += birdsArray[i];
        }

        return sum;
    }

    static int getBusyDays(int[] birdArray) {
        int busyDays = 0;

        for(int i = 0; i < birdArray.length; ++i) {
            if (birdArray[i] >= 5) {
                ++busyDays;
            }
        }

        return busyDays;
    }
}
