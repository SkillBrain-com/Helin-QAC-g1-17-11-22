package org.skillbrain.alexandraNegulescu.Tema_3;

public class ElonsToyCar {
    private int metersDriven;
    private int batteryPercentage;

    public static void main(String[] args) {
        ElonsToyCar car1 = ElonsToyCar.buy();
        System.out.println(car1);
        System.out.println(car1.distanceDisplay());
        System.out.println(car1.batteryDisplay());
        for(int i=0; i<98; i++){
            car1.drive();
        }
        System.out.println(car1.distanceDisplay());
        System.out.println(car1.batteryDisplay());

    }
    public static ElonsToyCar buy() {
        return new ElonsToyCar();
    }
    private ElonsToyCar() {
        this.metersDriven = 0;
        this.batteryPercentage = 100;
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