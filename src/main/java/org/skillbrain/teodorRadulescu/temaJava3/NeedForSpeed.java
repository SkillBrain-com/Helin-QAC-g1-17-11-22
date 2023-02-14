public class NeedForSpeed {
    int remainingBattery=100;
    int speed = 5;
    int batteryDrain = 2;
    int distanceDriven=0;
    NeedForSpeed(int speed, int batteryDrain){
        this.speed = speed;
        this.batteryDrain = batteryDrain;
    }

    public boolean batteryDrained() {
        if(this.remainingBattery < this.batteryDrain){
            return true;
        }else
            return false;
    }

    public int distanceDriven() {
        return this.distanceDriven;
    }

    public void drive() {
        if(!batteryDrained()){
            this.distanceDriven = this.distanceDriven + this.speed;
            this.remainingBattery = this.remainingBattery - this.batteryDrain;
        }
    }

    public static NeedForSpeed nitro() {
        NeedForSpeed car = new NeedForSpeed(50,4);
        return car;
    }
}

class RaceTrack {

    int distance = 800;

   RaceTrack(int distance){
          this.distance = distance;
  }

    public boolean carCanFinish(NeedForSpeed car) {
        while(!car.batteryDrained()){
            car.drive();
        }
        if(car.distanceDriven() >= this.distance){
            return true;
        }else
            return false;
    }
}
