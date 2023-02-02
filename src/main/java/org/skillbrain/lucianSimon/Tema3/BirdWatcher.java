package org.skillbrain.lucianSimon.Tema3;

public class BirdWatcher {

    public static void main(String[] args) {
        int[] arr = {2, 5, 3, 8, 0, 4};
        BirdWatcher bw = new BirdWatcher(arr);
        System.out.println(bw.getToday());
        System.out.println(bw.hasDayWithoutBirds());
        System.out.println(bw.getCountForFirstDays(3));
        System.out.println(bw.getBusyDays());
    }



    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {

        return birdsPerDay.clone();



        // birdsPerDay[0]=0;
        //      birdsPerDay[1]=2;
        //      birdsPerDay[2]=5;
        //      birdsPerDay[3]=3;
        //      birdsPerDay[4]=7;
        //      birdsPerDay[5]=8;
        //      birdsPerDay[6]=4;
        //      return birdsPerDay;
    }

    public int getToday() {
        int today=0;
        for ( int index=0;index<birdsPerDay.length;index++){
            if (index==birdsPerDay.length-1) {
                today = birdsPerDay[index];
            }
        }
        return today;

    }

    public void incrementTodaysCount() {  for ( int index=0;index<birdsPerDay.length;index++) {
        if (index == birdsPerDay.length - 1) {
            birdsPerDay[index]++;
        }
    }

    }

    public boolean hasDayWithoutBirds() {
        for (int index = 0; index < birdsPerDay.length; index++) {
            if (birdsPerDay[index] == 0) {
                return true;
            }
        }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int sum=0;
        int noOfDays=numberOfDays;
        if (numberOfDays>birdsPerDay.length) {
            noOfDays=birdsPerDay.length;
        }
        for (int index = 0; index < noOfDays; index++) {
            sum+=birdsPerDay[index];
        }
        return sum;
    }

    public int getBusyDays() {
        int busyDaysCounter =0;
        for (int index = 0; index < birdsPerDay.length; index++) {

            if (birdsPerDay[index]>=5){
                busyDaysCounter +=1;
            }
        }
        return busyDaysCounter;
    }
}
