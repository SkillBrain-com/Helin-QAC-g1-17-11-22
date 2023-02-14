package java.org.skillbrain.radulescuTeodor.temaJava2;

public class AnnalynsInfiltration {

    public static boolean canFastAttack(boolean knightIsAwake) {
        if (knightIsAwake) {
            return false;
        } else {
            return true;
        }
    }

    public static boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake) {
        if (knightIsAwake || archerIsAwake) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake) {
        if (prisonerIsAwake && !archerIsAwake) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean canFreePrisoner(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake, boolean dogIsPresent) {
        if (dogIsPresent) {
            return !archerIsAwake;
        } else {
            return prisonerIsAwake && !knightIsAwake && !archerIsAwake;
        }
    }
}
