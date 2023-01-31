package org.skillbrain.dana.Tema1.elons_toys_car;

public class ElonsToyCar {
    final static int MAX_METERS = 20;
    static int METERS = 0;
    static int BATTERY = 100;



    public static ElonsToyCar buy() {
    //throw new UnsupportedOperationException("Please implement the (static) RemoteControlCar.buy()  method"); ??
            ElonsToyCar car = new ElonsToyCar();
        return car;
    }

    public String distanceDisplay() {
        //throw new UnsupportedOperationException("Please implement the (static) RemoteControlCar.distanceDisplay()  method");
       return "Driven " + this.METERS + " meters";
    }

    public String batteryDisplay() {
        //throw new UnsupportedOperationException("Please implement the (static) RemoteControlCar.batteryDisplay()  method");
        return BATTERY>0 ? "Battery at " + this.BATTERY+ "%" : "Battery empty";
    }

    public void drive() {
        //Throw new UnsupportedOperationException("Please implement the (static) RemoteControlCar.drive()  method");
       //this.METERS += 20;

        if (this.BATTERY>0) {
            this.BATTERY -= 1;
            this.METERS += 20;
        }
    }

    public static void main(String[] args) {
        //Implement the (static) ElonsToyCar.buy() method to return a brand-new remote controlled car instance:
        ElonsToyCar car = ElonsToyCar.buy();

        //Implement the ElonsToyCar.distanceDisplay() method to return the distance as displayed on the LED display: => "Driven 0 meters"
        System.out.println(car.distanceDisplay());

        //Implement the ElonsToyCar.batteryDisplay() method to return the distance as displayed on the LED display:  => "Battery at 100%"
        System.out.println(car.batteryDisplay());

        //Implement the ElonsToyCar.drive() method that updates the number of meters driven:
        car.drive();
        car.drive();
        // => "Driven 40 meters"
        System.out.println(car.distanceDisplay());
        // => "Battery at 98%"
        System.out.println(car.batteryDisplay());

        //Update the ElonsToyCar.drive() method to not increase the distance driven nor decrease the battery percentage when the battery is drained (at 0%):
        for(int i =0 ; i<100; i++ ) {
            car.drive();
            System.out.println(car.distanceDisplay());
            System.out.println(car.batteryDisplay());
        }



    }
}

