package Tema3;

class NeedForSpeed {
    public int batteryDrain, speed, battery, distanceDriven;
    public static void main(String[] args) {
        int speed = 5;
        int batteryDrain = 2;
        NeedForSpeed car = new NeedForSpeed(speed, batteryDrain);
        System.out.println(car.speed);
        System.out.println(car.batteryDrain);

        car.drive();

        System.out.println(car.distanceDriven);
        System.out.println((car.battery));
        System.out.println(car.batteryDrained());

       car = NeedForSpeed.nitro();
       car.drive();
       System.out.println(car.distanceDriven());
    }

    public NeedForSpeed (int speed, int batteryDrained){
        this.batteryDrain = batteryDrained;
        this.speed = speed;
        this.battery = 100;
        this.distanceDriven = 0;
    }
    public boolean batteryDrained() {
        if (this.battery == 0)
            return true;
        else
            return false;
    }

    public int distanceDriven() {
        return this.distanceDriven;
    }

    public void drive() {
        if (this.battery >= this.batteryDrain){
            this.battery -= this.batteryDrain;
            this.distanceDriven += this.speed;
        }
    }

    public static NeedForSpeed nitro() {
        NeedForSpeed car = new NeedForSpeed(50, 4);
        return car;
    }
}

class RaceTrack {
    public int distance;

    public static void main(String[] args) {
        int distance = 800;
        RaceTrack raceTrack = new RaceTrack(distance);
        System.out.println(raceTrack.distance);

        int speed = 5;
        int batterydrain = 2;
        NeedForSpeed car = new NeedForSpeed(speed, batterydrain);
        distance = 100;
        RaceTrack race = new RaceTrack(distance);

        System.out.println(race.carCanFinish(car));
    }

    public RaceTrack (int distance){
        this.distance = distance;
    }
    public boolean carCanFinish(NeedForSpeed car) {
        if (car.battery / car.batteryDrain * car.speed >= this.distance)
            return true;
        else return false;
    }
}
