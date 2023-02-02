package org.skillbrain.panaitStelian;

public class Elonstoycar {

    private int battery = 100;
    private int totalDistance = 0;


    public static void main(String[] args) {
        Elonstoycar car1 = Elonstoycar.buy();
        System.out.println(car1);
        System.out.println(car1.distanceDisplay());
        System.out.println(car1.batteryDisplay());
        car1.Drive();
        car1.Drive();
        System.out.println("===================================================");
        for (int i = 0; i < 100; i++) {
            car1.Drive();
        }

        System.out.println(car1.distanceDisplay());
        System.out.println(car1.batteryDisplay());
    }

    public void Drive() {
        if (battery > 0) {
            totalDistance = totalDistance + 20;
            battery--;
        }
    }

    public static Elonstoycar buy() {
        return new Elonstoycar();
    }

    public String distanceDisplay() {
        return "Distance" + totalDistance + " meters";
    }

    public String batteryDisplay() {
        if (battery <= 0)
            return "Battery is Empty";
        return " Battery is at " + " " + +battery + " % ";
    }


}
