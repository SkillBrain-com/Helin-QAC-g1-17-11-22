package org.skillbrain.danaCatavei.JavaBasics3.need_for_speed;

class NeedForSpeed {
    // TODO: define the constructor for the 'NeedForSpeed' class
    private int speed;
    private int batteryDrain;
    private int battery;
    private int distance;


    public NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;
        this.battery = 100;
        this.distance = 0;
    }

    public boolean batteryDrained() {
        //throw new UnsupportedOperationException("Please implement the NeedForSpeed.batteryDrained() method");
        return this.battery > 0 ? false : true;

    }

    public int distanceDriven() {
        //throw new UnsupportedOperationException("Please implement the NeedForSpeed.distanceDriven() method");
        return distance;
    }

    public void drive() {
        //throw new UnsupportedOperationException("Please implement the NeedForSpeed.drive() method");
        if (battery > 0) {
            battery -= batteryDrain;
            distance += speed;
        }
    }

    public static NeedForSpeed nitro() {
        //throw new UnsupportedOperationException("Please implement the (static) NeedForSpeed.nitro() method");
        return new NeedForSpeed(50, 4);
    }

    public static void main(String[] args) {
        int speed = 5;
        int batteryDrain = 2;
        //Allow creating a remote controller car by defining a constructor for the NeedForSpeed class that takes the speed of the car in meters and the battery drain percentage as its two parameters (both of type int):
        NeedForSpeed car = new NeedForSpeed(speed, batteryDrain);
        System.out.println("Speed: " + car.speed + " Battery drain: " + car.batteryDrain + " Battery charge: " + car.battery);


        //Allow creating a race track by defining a constructor for the RaceTrack class that takes the track's distance in meters as its sole parameter (which is of type int):
        int distance = 800;
        RaceTrack raceTrack = new RaceTrack(distance);
        System.out.println(raceTrack.distanceRace);

        //Implement the NeedForSpeed.drive() method that updates the number of meters driven based on the car's speed. Also implement the NeedForSpeed.distanceDriven() method to return the number of meters driven by the car:
        // => 5
        car.drive();
        System.out.println(car.distanceDriven());

        //Update the NeedForSpeed.drive() method to drain the battery based on the car's battery drain. Also implement the NeedForSpeed.batteryDrained() method that indicates if the battery is drained:
        // => false
        System.out.println(car.batteryDrained());

        //The best-selling remote control car is the Nitro, which has a stunning top speed of 50 meters with a battery drain of 4%. Implement the (static) NeedForSpeed.nitro() method to return this type of car:
        NeedForSpeed carnitro = NeedForSpeed.nitro();
        carnitro.drive();
        System.out.println(carnitro.distanceDriven());
        // => 50

        //To finish a race, a car has to be able to drive the race's distance. This means not draining its battery before having crossed the finish line. Implement the RaceTrack.carCanFinish() method that takes a NeedForSpeed instance as its parameter and returns true if the car can finish the race; otherwise, return false:
        distance = 100;
        RaceTrack race = new RaceTrack(distance);
        System.out.println(race.carCanFinish(car) == true ? "Masina poate finaliza cursa! " + race.carCanFinish(car) : " Masina NU poate finaliza cursa!" + race.carCanFinish(car));
        // => true

    }
}
