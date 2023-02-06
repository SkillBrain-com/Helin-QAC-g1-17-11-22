package org.skillbrain.alexandraNegulescu.Tema_3;

public class ElonsToyCar {
    private int metersDriven;
    private int batteryPercentage;

    private ElonsToyCar() {
        this.metersDriven = 0;
        this.batteryPercentage = 100;
    }

    public static incercareElon buy() {
        return new incercareElon();
    }

    public String distanceDisplay() {
        return "Driven " + this.metersDriven + " meters";
    }

    public String batteryDisplay() {
        if (this.batteryPercentage == 0) {
            return "Battery empty";
        }
        return "Battery at " + this.batteryPercentage + "%";
    }

    public void drive() {
        if (this.batteryPercentage == 0) {
            return;
        }
        this.metersDriven += 20;
        this.batteryPercentage--;
    }
}

