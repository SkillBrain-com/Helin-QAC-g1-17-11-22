package org.skillbrain.andaDarjan.Tema3;

public class NeedForSpeed {
    public static void main(String[] args) {

    }
    //define the constructor
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
    //define the constructor for the 'RaceTrack' class
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
