package Tema2;

class AnnalynsInfiltration {
    public static void main(String[] args) {
        boolean knightIsAwake, archerIsAwake, prisonerIsAwake, petDogIsPresent;

        knightIsAwake = true;
        System.out.println(AnnalynsInfiltration.canFastAttack(knightIsAwake));

        knightIsAwake = false;
        archerIsAwake = true;
        prisonerIsAwake = false;
        System.out.println(AnnalynsInfiltration.canSpy(knightIsAwake, archerIsAwake, prisonerIsAwake));

        archerIsAwake = false;
        prisonerIsAwake = true;
        System.out.println(AnnalynsInfiltration.canSignalPrisoner(archerIsAwake, prisonerIsAwake));

        knightIsAwake = false;
        archerIsAwake = true;
        prisonerIsAwake = false;
        petDogIsPresent = false;
        System.out.println(AnnalynsInfiltration.canFreePrisoner(knightIsAwake, archerIsAwake, prisonerIsAwake, petDogIsPresent));
    }
    public static boolean canFastAttack(boolean knightIsAwake) {
        return !knightIsAwake;
    }

    public static boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake) {
        return knightIsAwake || archerIsAwake || prisonerIsAwake;
    }

    public static boolean canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake) {
        return !archerIsAwake && prisonerIsAwake;
    }

    public static boolean canFreePrisoner(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake, boolean petDogIsPresent) {
        return (prisonerIsAwake && !knightIsAwake && !archerIsAwake) || (!archerIsAwake && petDogIsPresent);
    }

}
