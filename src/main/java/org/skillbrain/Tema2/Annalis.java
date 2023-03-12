package org.skillbrain.Tema2;

public class Annalis {
    public static void main(String[] args) {


    boolean knightIsAwake = true;
    boolean archerIsAwake = false;
    boolean prisonerIsAwake = false;
    boolean petDogIsPresent = true;
        if (canFastAttack(knightIsAwake))
            System.out.println("Knight poate fi atacat");
        else System.out.println("Knight nu poate fi atacat");
        if (canSpy(knightIsAwake, archerIsAwake, prisonerIsAwake))
            System.out.println("Poti spiona");
        else System.out.println("Nu poti spiona");
        if (canSignalPrisoner ( archerIsAwake, prisonerIsAwake))
            System.out.println("Poti comunica cu prizonierul");
        else System.out.println("Shh, fa liniste!");
        if(canFreePrisoner(knightIsAwake, archerIsAwake, prisonerIsAwake, petDogIsPresent))
            System.out.println("Felicitari!Poti elibera prizionerul");
        else System.out.println("Mai incearca! Prizionerul nu poate fi eliberat momentan");

}


    static boolean canFastAttack(boolean knightIsAwake) {
        return !knightIsAwake;
    }

    static boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake) {
        if ((knightIsAwake || archerIsAwake || prisonerIsAwake) == false) {
            return true;
        }
        else return false;
    }

    static boolean canSignalPrisoner (boolean archerIsAwake, boolean prisonerIsAwake){
        if (prisonerIsAwake && !archerIsAwake)
            return true;
        else return false;
    }
    static boolean canFreePrisoner(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake, boolean petDogIsPresent){
        if (petDogIsPresent && !archerIsAwake)
            return true;
        else if ( prisonerIsAwake && !knightIsAwake && !archerIsAwake)
            return true;
        else return false;

    }

}
