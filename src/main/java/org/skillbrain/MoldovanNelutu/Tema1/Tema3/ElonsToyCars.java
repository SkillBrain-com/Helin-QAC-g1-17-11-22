package org.skillbrain.MoldovanNelutu.Tema1.Tema3;

public class ElonsToyCars {

    private int battery = 100;
    private int totalDistance = 0;

    public static void main(String[] args) {
        ElonsToyCars car1 = buy();
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

    public static ElonsToyCars buy() {
        return new ElonsToyCars();
    }

    public String distanceDisplay() {
        return "Driven " + totalDistance + " meters. ";
    }

    public String displayBattery() {
        if (battery <= 0) {
            return "Battery is empty ";
        }
        return "Battery is at " + battery + "%";
    }

    public void drive() {
        if (battery > 0) {
            totalDistance += 20;
            battery--;
            return;
        }

    }
}
