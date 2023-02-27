package org.skillbrain.MoldovanNelutu.Tema1.Tema3;

public class NeedForSpeed {
    private static int speed;
    private static int batteryDrain;
    private static int battery;
    private static int distanceCovered;

    public void main(String[] args) {
//        NeedForSpeed car1 = new NeedForSpeed(speed , batteryDrain);
//        raceTrak monaco = new raceTrak(distance: 6);
//        car1.drive();
//        car1.drive();
//        System.out.println(car1.battery);
//        System.out.println(car1.distanceCovered);
//        System.out.println(car1.isDrained());
//        NeedForSpeed nitroCar = new NeedForSpeed.nitro();
//        nitroCar.drive();
//        nitroCar.drive();
//        System.out.println(nitroCar.distanceCovered);
//        System.out.println(nitroCar.battery);
//        System.out.println(monaco.canFinish(car1));
//        System.out.println(monaco.canFinish(nitroCar));


    }

    public static NeedForSpeed nitro;

    {
        //       return new NeedForSpeed(speed 50 , batteryDrain 4);
    }

    boolean isDrained() {
        if (battery <= 0) {
            return true;
        }
        return false;
    }

    public void drive() {
        if (battery < 0) {
            distanceCovered += speed;
            battery -= batteryDrain;
        }
    }

    public NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;
        this.battery = 100;
    }

    public class raceTrak {
        public int distance;

        public raceTrak(int distance) {
            this.distance = distance;
        }
    }

    public boolean canFinish(NeedForSpeed car) {
        while (!car.isDrained()) {
            return true;
        }
        return false;
    }
}
