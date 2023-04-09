package org.skillbrain.crinaSas.JavaBasics3;

public class ElonsToyCar {

    private int battery = 100;
    private int totalDistance;


    public static void main(String[] args) {
        ElonsToyCar car1 = ElonsToyCar.buy();
        System.out.println(car1);
        System.out.println(car1.distanceDisplay());
        System.out.println(car1.displayBattery());
        car1.drive();
        car1.drive();
        System.out.println("================");
        for (int i = 0; i < 100; i++) {
            car1.drive();
        }
        System.out.println(car1.distanceDisplay());
        System.out.println(car1.displayBattery());

    }

    public void drive() {
        if (battery > 0) {
            totalDistance += 20;
            battery--;
            return;
        }

    }

    public static ElonsToyCar buy() {
        return new ElonsToyCar();
    }

    public String distanceDisplay() {
        return "Driven " + totalDistance + " meters.";
    }

    public String displayBattery() {
        if (battery <= 0) {
            return "Battery is empty";
        }
        return "Battery is at " + battery + "%";
    }

}
