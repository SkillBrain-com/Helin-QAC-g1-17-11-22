package org.skillbrain.danielIrimia.Tema3;

public class NeedForSpeed {

    // Instructions
    // In this exercise you'll be organizing races between various types of remote controlled cars.
    // Each car has its own speed and battery drain characteristics.
    // Cars start with full (100%) batteries. Each time you drive the car using the remote control,
    // it covers the car's speed in meters and decreases the remaining battery percentage by its battery drain.
    // If a car's battery is below its battery drain percentage, you can't drive the car anymore.
    // Each race track has its own distance. Cars are tested by checking if they can finish the
    // track without running out of battery.
    // You have six tasks, each of which will work with remote controller car instances.

    int speed;
    int batteryDrain;
    int batteryLife = 100;

    public NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;
    }

    public static void main(String[] args) {

        // 1. Creating a remote controlled car
        // Allow creating a remote controller car by defining a constructor for the NeedForSpeed class that takes
        // the speed of the car in meters and the battery drain percentage as its two parameters (both of type int):
        int speed = 5;
        int batteryDrain = 2;
        NeedForSpeed car = new NeedForSpeed(speed, batteryDrain);

        System.out.println("1.=====================================");
        System.out.println("Car speed: " + car.speed + " m/s");
        System.out.println("Battery drain: " + car.batteryDrain + "%");
        System.out.println("Battery life: " + (car.batteryLife - car.batteryDrain) + "%");
        System.out.println("Distance driven: " + car.distanceDriven() + "m");


        // 2. Creating a track race
        // Allow creating a track race by defining a constructor for the RaceTrack class that takes the track's
        // distance in meters as its sole parameter (which is of type int):

        int distance = 800;
        RaceTrack raceTrack = new RaceTrack(distance);
        System.out.println("2.=====================================");
        System.out.println("Distance is: " + raceTrack.distance + "m");



        // 3. Drive the car
        // Implement the NeedForSpeed.drive() method that updates the number of meters driven based on the car's speed.
        // Also implement the NeedForSpeed.distanceDriven() method to return the number of meters driven by the car:
        System.out.println("3.=====================================");
        car.drive();
        System.out.println("Distance driven: " + car.distanceDriven() + "m");

        // 4. Check for a drained battery
        // Update the NeedForSpeed.drive() method to drain the battery based on the car's battery drain. Also implement
        // the NeedForSpeed.batteryDrained() method that indicates if the battery is drained:
        System.out.println("4.=====================================");
        car.drive();
        System.out.println("Distance driven: " + car.distanceDriven() + "m");
        System.out.println("Battery drained: " + car.batteryDrained());
        System.out.println("Battery life: " + car.batteryLife + "%");

        // 5. Create the Nitro remote control car
        // The best-selling remote control car is the Nitro, which has a stunning top speed of 50 meters with a battery
        // drain of 4%. Implement the (static) NeedForSpeed.nitro() method to return this type of car:
        System.out.println("5.=====================================");
        NeedForSpeed car2 = NeedForSpeed.nitro();
        car2.drive();
        car2.distanceDriven();
        System.out.println("Distance driven: " + car2.distanceDriven() + "m");
        System.out.println("Battery drained: " + car2.batteryDrained());

        // 6. Check if a remote control car can finish a race
        // To finish a race, a car has to be able to drive the race's distance. This means not draining its battery
        // before having crossed the finish line. Implement the RaceTrack.carCanFinish() method that takes a
        // NeedForSpeed instance as its parameter and returns true if the car can finish the race; otherwise, return false:
        System.out.println("6.=====================================");

        NeedForSpeed car3 = new NeedForSpeed(speed, batteryDrain);
        int distance2 = 100;
        RaceTrack race = new RaceTrack(distance2);

        System.out.println("Distance driven: " + race.distance + "m");
        System.out.println("Car 3 can finish " + race.carCanFinish(car3));

    }

    public boolean batteryDrained() {
        return batteryLife < batteryDrain;
    }

    public int distanceDriven() {
        return (batteryLife / batteryDrain) * speed;
    }

    public void drive() {
        if (batteryDrained()) {
            System.out.println("Battery drained!");
        } else {
            batteryLife -= batteryDrain;
            System.out.println("Driving at " + speed + " m/s");
        }
    }

    public static NeedForSpeed nitro() {
        return new NeedForSpeed(50, 4);
    }

}

class RaceTrack {
    int distance;
    public RaceTrack(int distance) {
        this.distance = distance;
    }

    public boolean carCanFinish( NeedForSpeed car) {
        return car.distanceDriven() >= distance;
    }
}
