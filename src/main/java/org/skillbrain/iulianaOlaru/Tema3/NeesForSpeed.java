package org.skillbrain.iulianaOlaru.Tema3;

public class NeesForSpeed {

    private int speed;
    private int batteryDrain;
    private int battery;
    private int distanceCovered;

    public static void main(String[] args) {
        NeesForSpeed car1 = new NeesForSpeed(5, 2);
        RaceTrack monaco = new RaceTrack(1200);
        car1.drive();
        car1.drive();;
        System.out.println(car1.battery);
        System.out.println(car1.distanceCovered);
        System.out.println(car1.isDrained());
        NeesForSpeed nitrocar = NeesForSpeed.nitro();
        // nitrocar.drive();
        // nitrocar.drive();
        for (int i = 0; i < 25; i++){
            nitrocar.drive();
        }
        System.out.println(nitrocar.distanceCovered);
        System.out.println(nitrocar.battery);
        System.out.println("===============================");
        System.out.println(monaco.canFinishRAcfe(car1));
        // System.out.println("Can nitro car finish?"+monaco.canFinish(nitrocar));
        System.out.println("Can nitro car finish?" + monaco.canFinishRAcfe(nitrocar));

    }

    public int getDistanceCovered() {
        return distanceCovered;
    }

    public static NeesForSpeed nitro(){
        return new  NeesForSpeed(50, 4);
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

    public NeesForSpeed(int speed, int batteryDrain) {
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

    /* public boolean canFinish(NeesForSpeed car){
        while (!car.isDrained()){
            return true;
        }
        return false;
    }*/

    public boolean canFinishRAcfe(NeesForSpeed car){

        if ((car.getDistanceCovered() >= distance) && !car.isDrained()){
            return true;
        }
        return false;
    }



}
