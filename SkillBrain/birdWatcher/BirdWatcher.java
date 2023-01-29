import java.util.Arrays;

public class BirdWatcher {
  private final int[] birdsPerDay;

  public BirdWatcher(int[] birdsPerDay) {
    this.birdsPerDay = birdsPerDay.clone();
  }

  // Task 1: Check what the counts were last week
  public int[] getLastWeek() {
    return birdsPerDay;
  }

  // Task 2: Check how many birds visited today
  public int getToday() {
    return birdsPerDay[birdsPerDay.length - 1];
  }

  // Task 3: Increment today's count
  public void incrementTodaysCount() {
    birdsPerDay[birdsPerDay.length - 1]++;
  }

  // Task 4: Check the average number of birds per day
  public double getAveragePerDay() {
    int total = 0;
    for (int count : birdsPerDay) {
      total += count;
    }
    return (double) total / birdsPerDay.length;
  }

  // Task 5: Check the maximum number of birds in a day
  public int getMaxPerDay() {
    int max = 0;
    for (int count : birdsPerDay) {
      max = Math.max(max, count);
    }
    return max;
  }

  // Task 6: Check the minimum number of birds in a day
  public int getMinPerDay() {
    int min = Integer.MAX_VALUE;
    for (int count : birdsPerDay) {
      min = Math.min(min, count);
    }
    return min;
  }

  // Task 7: Check if there is a day without birds
  public boolean hasDayWithoutBirds() {
    for (int count : birdsPerDay) {
      if (count == 0) {
        return true;
      }
    }
    return false;
  }

  // Task 8: Check the number of birds in the first N days
  public int getCountForFirstDays(int numberOfDays) {
    int total = 0;
    for (int i = 0; i < numberOfDays; i++) {
      total += birdsPerDay[i];
    }
    return total;
  }

  // Task 9: Check the number of days with more than 5 birds
  public int getBusyDays() {
    int busyDays = 0;
    for (int count : birdsPerDay) {
      if (count > 5) {
        busyDays++;
      }
    }
    return busyDays;
  }

  public static void main(String[] args) {
    int[] birdsPerDay = { 2, 5, 0, 7, 4, 1 };
    BirdWatcher birdCount = new BirdWatcher(birdsPerDay);

    // Test getLastWeek()
    int[] lastWeek = birdCount.getLastWeek();
    System.out.println(Arrays.toString(lastWeek)); // prints [2, 5, 0, 7, 4, 1]

    // Test getToday()
    int today = birdCount.getToday();
    System.out.println(today); // prints 1

    // Test incrementTodaysCount()
    birdCount.incrementTodaysCount();
    System.out.println(birdCount.getToday()); // prints 2

    // Test hasDayWithoutBirds()
    System.out.println(birdCount.hasDayWithoutBirds()); // prints true

    // Test getCountForFirstDays()
    System.out.println(birdCount.getCountForFirstDays(3)); // prints 7

    // Test getBusyDays()
    System.out.println(birdCount.getBusyDays()); // prints 2

  }
}