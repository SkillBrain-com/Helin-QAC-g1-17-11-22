package org.skillbrain.panaitStelian;

public class NeedforSpeed {

    private int speed;
    private int batteryDrain;
    private int battery;
    private int distanceCovered;

    public int getDistanceCovered() {
        return distanceCovered;
    }

    public static void main(String[] args) {
        NeedforSpeed car1 = new NeedforSpeed(5,2);
        RaceTrack MONACO= new RaceTrack(1200);
        System.out.println(MONACO);
        car1.drive();
        car1.drive();
        System.out.println(car1.battery);
        System.out.println(car1.distanceCovered);
        System.out.println(car1.isDrained());
        NeedforSpeed nitroCar = NeedforSpeed.nitro();
        for ( int i = 0; i < 25; i++){
            nitroCar.drive();
        }
        System.out.println(nitroCar.distanceCovered);
        System.out.println(nitroCar.battery);
//        System.out.println(MONACO.canFinish(car1));
//        System.out.println("Can nitro car finish ?" +  MONACO.canFinish(nitroCar));
        System.out.println("Can nitro car finish" + MONACO.canFinishRace(nitroCar));

    }
    public int getDistanceCoveerede(){
        return distanceCovered;
    }
    public static NeedforSpeed nitro(){
        return  new NeedforSpeed(50,4);
    }


    boolean  isDrained(){
        if(battery <= 0){
         return true;
        }
        return false;
    }
    public  void  drive(){
    if (battery > 0){
        distanceCovered += speed;
        battery -= batteryDrain;
      }
    }

    public NeedforSpeed(int speed, int batteryDrain) {
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
//    public boolean canFinish(NeedforSpeed car) {
//        if (!car.isDrained()) {
//            return true;
//        }
//       else return false;
//    }
    public boolean  canFinishRace(NeedforSpeed car){
       if(car.getDistanceCovered() >= distance ){
            return true;
        }
        return false;
    }
}
