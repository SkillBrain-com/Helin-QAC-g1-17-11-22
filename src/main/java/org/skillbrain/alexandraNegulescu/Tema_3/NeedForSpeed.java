package org.skillbrain.alexandraNegulescu.Tema_3;

class NeedForSpeed {
    int speed;
    int batteryDrain;
    int distanceDriven = 0;
    int batteryLeft = 100;

    public static void main(String[] args) {
        NeedForSpeed car = new NeedForSpeed(5, 2);
        RaceTrack raceTrack = new RaceTrack(10);
        System.out.println(raceTrack.distance);
        car.drive();
        car.drive();
        System.out.println(car.batteryLeft);
        System.out.println(car.distanceDriven);
        System.out.println(car.batteryLeft);
        System.out.println(car.batteryDrained());
        NeedForSpeed nitroCar = NeedForSpeed.nitro();
        nitroCar.drive();
        nitroCar.drive();
        nitroCar.drive();
        System.out.println(nitroCar.distanceDriven);
        System.out.println(nitroCar.batteryLeft);
        System.out.println(raceTrack.carCanFinish(car));
    }

    NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;
    }

    public void drive() {
        if (batteryLeft < batteryDrain) {
            return;
        }
        distanceDriven += speed;
        batteryLeft -= batteryDrain;
    }

    int distanceDriven() {
        return distanceDriven;
    }

    boolean batteryDrained() {
        return batteryLeft < batteryDrain;
    }

    public static NeedForSpeed nitro() {
        return new NeedForSpeed(50, 4);
    }
}

class RaceTrack {
    int distance;

    RaceTrack(int distance) {
        this.distance = distance;
    }

    boolean carCanFinish(NeedForSpeed car) {
        while (!car.batteryDrained()) {
            car.drive();
            if (car.distanceDriven() >= distance) {
                return true;
            }
        }
        return false;
    }
}

