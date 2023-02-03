package org.skillbrain.cristianLuca.Tema3.ElonsToyCar;

public class ElonsToyCar {
    private int distance;
    private int battery;

    public ElonsToyCar() {
        this.battery = 100;
        this.distance = 0;
    }

    public static ElonsToyCar buy() {
        ElonsToyCar car = new ElonsToyCar();
        return car;
    }

    public String distanceDisplay() {
        return String.format("Driven %d meters", distance);
    }

    public String batteryDisplay() {
        if (battery == 0) {
            return "Drain battery";
        }
        return String.format("Battery at %d%%", battery);
    }

    public void drive() {
        if (battery != 0) {
            distance += 20;
            battery--;
        }
    }
}


