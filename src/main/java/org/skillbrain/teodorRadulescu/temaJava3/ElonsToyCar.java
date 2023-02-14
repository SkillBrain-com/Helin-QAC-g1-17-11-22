package TEMA;



public class ElonsToyCar {

    public static void main(String[] args) {
        System.out.println(distanceDisplay(0));
        System.out.println(batteryDisplay(100));
        System.out.println(drive(20,98));
        System.out.println(drive(2000));
    }

    public static ElonsToyCar buy() {
       return new ElonsToyCar();

    }

    public static String distanceDisplay(int distanceDriven) {
        return "Driven " + distanceDriven+ " meters";
    }

    public static String batteryDisplay(int batteryPercentage) {
          return "Battery at " + batteryPercentage + " percent.";
      }



    public static Object drive(int distanceDriven, int batteryPercentage) {
        if (batteryPercentage > 0) {
            distanceDriven += 20;
            batteryPercentage -= 1;
            return batteryPercentage;


        }
        return "Battery empty";
    }

  public static String drive(int distanceDriven){
    return "Driven " +distanceDriven+ " meters.";
    }
}


