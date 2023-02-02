package Tema3;

public class ElonsToyCar {
    private int drivenDistance;
    private int batteryCharge;
    public static ElonsToyCar buy() {
        return new ElonsToyCar();
    }
    public ElonsToyCar() {
        drivenDistance = 0;
        batteryCharge = 100;
    }
    public String distanceDisplay() {
        return "Driven " + drivenDistance + " meters";
    }
    public String batteryDisplay() {
        if (batteryCharge == 0) {
            return "Battery empty";
        }
        return "Battery at " + batteryCharge + '%';
    }
    public void drive() {
        if (batteryCharge > 0) {
            drivenDistance += 20;
            batteryCharge -= 1;
        }
    }
}
