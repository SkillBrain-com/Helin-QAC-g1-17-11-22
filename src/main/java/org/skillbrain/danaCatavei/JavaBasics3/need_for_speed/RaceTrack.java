package org.skillbrain.danaCatavei.JavaBasics3.need_for_speed;

class RaceTrack {
    // TODO: define the constructor for the 'RaceTrack' class

    int distanceRace;

    public RaceTrack(int distance){
        this.distanceRace = distance;
    }
    public boolean carCanFinish(NeedForSpeed car) {
        //throw new UnsupportedOperationException("Please implement the RaceTrack.carCanFinish() method");
        while(!car.batteryDrained()){
            car.drive();
        }
        return (car.distanceDriven()>=distanceRace)? true: false;

    }
}
