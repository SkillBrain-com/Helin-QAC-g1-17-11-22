package Tema3;

class NeedForSpeed {
    // TODO: define the constructor for the 'NeedForSpeed' class
    private int speed, batteryDrain, distance, battery=100;

    NeedForSpeed(int speed, int batteryDrain){
        this.speed = speed;
        this.batteryDrain = batteryDrain;
    }
    public boolean batteryDrained() {
        return (battery==0);
    }
    public int distanceDriven() {
        return distance;
    }
    public void drive() {
        if(battery>0){
            distance+=speed;
            battery-=batteryDrain;
        }
    }
    public static NeedForSpeed nitro() {
        return new NeedForSpeed(50,4);
    }
}
class RaceTrack {
    // TODO: define the constructor for the 'RaceTrack' class
    private int distance;

    RaceTrack(int distance){
        this.distance=distance;
    }
    public boolean carCanFinish(NeedForSpeed car) {
        while(!car.batteryDrained()){
            car.drive();
        }
        return (car.distanceDriven()>=distance)? true: false;
    }
}

