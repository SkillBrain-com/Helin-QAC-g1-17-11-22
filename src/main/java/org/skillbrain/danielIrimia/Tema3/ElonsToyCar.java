package org.skillbrain.danielIrimia.Tema3;

public class ElonsToyCar {
    private int meters;
    private int batteryPercentage = 100;
    private boolean drive = true;


    ElonsToyCar() {
    }

    public static void main(String [] args) {
        // 1. Buy a brand-new remote controlled car
        // Implement the (static) ElonsToyCar.buy() method to return a brand-new remote controlled car instance:
        ElonsToyCar car = ElonsToyCar.buy();
        System.out.println(car);
        System.out.println("================");

        // 2. Display the distance driven
        //Implement the ElonsToyCar.distanceDisplay() method to return the distance as displayed on the LED display:
        car.distanceDisplay();
        System.err.println("================");

        // 3. Display the battery percentage
        //Implement the ElonsToyCar.batteryDisplay() method to return the distance as displayed on the LED display:
        // The remaining battery charge, displayed as: "Battery at <PERCENTAGE>%".
        car.batteryDisplay();
        System.err.println("================");

        // 4. Update the number of meters driven when driving
        //Implement the ElonsToyCar.drive() method that updates the number of meters driven:
        car.drive();
        car.drive();
        car.distanceDisplay();
        System.err.println("================");

        // 5. Update the battery percentage when driving
        // Update the ElonsToyCar.drive() method to update the battery percentage:
        car.drive();
        car.drive();
        car.batteryDisplay();
        System.err.println("================");

        // 6. Don't drive if the battery is empty
        //Update the ElonsToyCar.drive() method to not drive if the battery is empty:
        ElonsToyCar car2 = ElonsToyCar.buy();
        for (int i = 0; i < 100 ; i++) {
            car2.drive();
        }
        car2.distanceDisplay();
        car2.batteryDisplay();
        System.err.println("================");

    }

    public static ElonsToyCar buy() {
        return new ElonsToyCar();
    }

    public String distanceDisplay() {
        System.out.println("Driven " + meters + " meters");
        return "Driven " + meters + " meters";
    }

    public String batteryDisplay() {

        if (batteryPercentage == 0) {
            System.out.println("Battery empty");
            return "Battery empty";
        }
        System.out.println("Battery at " + batteryPercentage + "%");
        return "Battery at " + batteryPercentage + "%";
    }

    public void drive() {
        if (!drive) {
            System.out.println("Battery empty");
        } else {
            meters += 20;
            batteryPercentage -= 1;
            if (batteryPercentage == 0) {
                drive = false;
            }
        }
    }
}










