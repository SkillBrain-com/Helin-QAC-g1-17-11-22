package org.skillbrain.Tema4.Tema3;
public class NeedForSpeed {

    private int speed;
    private int batteryDrain;
    private int battery;
    private int distanceCovered;

    public NeedForSpeed() {

    }

    public static void main(String[] args) {
        NeedForSpeed car1 = new NeedForSpeed();
        RaceTrack monaco = new RaceTrack(1200);
        car1.drive();
        car1.drive();;
        System.out.println(car1.battery);
        System.out.println(car1.distanceCovered);
        System.out.println(car1.isDrained());
        NeedForSpeed nitrocar = nitro();
        // nitrocar.drive();
        // nitrocar.drive();
        for (int i = 0; i < 25; i++){
            nitrocar.drive();
        }
        System.out.println(nitrocar.distanceCovered);
        System.out.println(nitrocar.battery);

        System.out.println("monaco.canFinishRAcfe(car1)");
        System.out.println("Can nitro car finish?" +" monaco.canFinishRAcfe(nitrocar)");

    }

    public int getDistanceCovered() {
        return distanceCovered;
    }

    public static NeedForSpeed nitro(){
        return new NeedForSpeed();
        //  new NeedForSpeed(50, 4);
    }
    boolean isDrained(){
        if (battery <= 0){
            return true;
        }
        return false;
    }
    public void drive() {
        if (battery > 0){
            distanceCovered += speed;
            battery -= batteryDrain;
        }
    }

    public NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;
        this.battery = 100;
    }

}

class RaceTrack{

    private int distance;

    public RaceTrack(int distance) {
        this.distance = distance;
    }



    public boolean canFinishRAcfe(NeedForSpeed car){

        if ((car.getDistanceCovered() >= distance) && !car.isDrained()){
            return true;
        }
        return false;
    }



}



