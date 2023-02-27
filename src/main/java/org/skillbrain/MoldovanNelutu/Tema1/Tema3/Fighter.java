package org.skillbrain.MoldovanNelutu.Tema1.Tema3;

public abstract class Fighter {

    abstract int damagePoints(Fighter fighter);

    boolean isVulnerable() {
        return false;

    }

    @Override
    public String toString() {
        return "Fighter is " + this.getClass().getSimpleName();
    }
}

class Warrior extends Fighter {


    @Override
    int damagePoints(Fighter fighter) {
        return fighter.isVulnerable() ? 10 : 6;
    }

    public static void main(String[] args) {
        Fighter warrior = new Warrior();
        Fighter wizzard = new Wizzard();
        ((Wizzard) wizzard).prepareSpell();
        System.out.println(warrior.damagePoints(wizzard));
        System.out.println(wizzard.damagePoints(warrior));
        System.out.println("Dupa vraja ============ ");
        System.out.println(warrior.damagePoints(wizzard));
        System.out.println(wizzard.damagePoints(warrior));
    }

}

class Wizzard extends Fighter {
    private int spells;

    boolean isVulnerable() {
        return spells == 0;
    }

    public void prepareSpell() {
        spells++;

    }

    @Override
    int damagePoints(Fighter fighter) {
        if (spells == 0) {
            return 3;
        }
        spells--;
        return 12;

    }


}