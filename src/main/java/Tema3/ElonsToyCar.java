package Tema3;

public class ElonsToyCar {
    public int battery = 0, distance = 0;
    public static void main(String[] args) {
        ElonsToyCar car = ElonsToyCar.buy();
        System.out.println(car.distanceDisplay());
        System.out.println(car.batteryDisplay());
        car.drive();
        car.drive();
        System.out.println(car.distanceDisplay());
        System.out.println(car.batteryDisplay());

        for (int i = 1; i <= 98; i ++)
            car.drive();

        System.out.println(car.distanceDisplay());
        System.out.println(car.batteryDisplay());
    }
    public static ElonsToyCar buy() {
        ElonsToyCar car = new ElonsToyCar();
        car.battery = 100;
        return car;
    }

    public String distanceDisplay() {
        return "Driven " + this.distance + " meters";
    }

    public String batteryDisplay() {
        if (this.battery == 0)
            return "Battery empty";
        return "Battery at " + this.battery + "%";
    }

    public void drive() {
        if (this.battery >= 1){
            this.distance += 20;
            this.battery --;
        }
    }
}
