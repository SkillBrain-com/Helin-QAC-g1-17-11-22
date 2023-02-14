package java.org.skillbrain.radulescuTeodor.temaJava2;

public class Lasagna {
  public static int expectedMinutesInOven() {
    return 40;
  }

  public static int remainingMinutesInOven(int actualMinutesInOven) {
    int expectedMinutesInOven = expectedMinutesInOven();
    return expectedMinutesInOven - actualMinutesInOven;
  }

  public static int preparationTimeInMinutes(int numLayers) {
    return numLayers * 2;
  }

  public static int totalTimeInMinutes(int numLayers, int minutesInOven) {
    int preparationTime = preparationTimeInMinutes(numLayers);
    return preparationTime + minutesInOven;
  }

  public static void main(String[] args) {
    int expectedOvenTime = expectedMinutesInOven();
    int remainingOvenTime = remainingMinutesInOven(30);
    int preparationTime = preparationTimeInMinutes(3);
    int totalTime = totalTimeInMinutes(3, 40);

    System.out.println("Expected oven time: " + expectedOvenTime + " minutes");
    System.out.println("Remaining oven time: " + remainingOvenTime + " minutes");
    System.out.println("Preparation time: " + preparationTime + " minutes");
    System.out.println("Total time: " + totalTime + " minutes");
  }
}
