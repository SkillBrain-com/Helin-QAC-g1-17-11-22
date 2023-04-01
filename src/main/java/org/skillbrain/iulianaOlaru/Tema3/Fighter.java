package org.skillbrain.iulianaOlaru.Tema3;

// scopul claselor abstracte este de a fi mostenite de alte clase!!
public abstract class Fighter {

    abstract int damagePoints(Fighter fighter);
    boolean isVulnerable(){
        return  false;
    }

    @Override
    public String toString() {
        return "Fighter is " + this.getClass().getSimpleName();
    }
}

class  Warrior extends Fighter{

    @Override
    boolean isVulnerable(){
        return  true;
    }

    @Override
    int damagePoints(Fighter fighter) {
        return fighter.isVulnerable() ? 10 : 6;
    }

    public static void main(String[] args) {
        Fighter warrior = new Warrior();
        Fighter wizard = new Wizard();
        ((Wizard)wizard).prepareSpell();
        // System.out.println(wizard);
        // System.out.println(warrior);
        System.out.println(warrior.damagePoints(warrior));
        System.out.println(warrior.damagePoints(wizard));
        System.out.println("================== Dupa vraja =================");
        System.out.println(warrior.damagePoints(warrior));
        System.out.println(warrior.damagePoints(wizard));

    }

    static class Wizard extends Fighter{

        private int spells;

        @Override
        int damagePoints(Fighter fighter) {
            // return (spells == 0 ? 3 : 12); // daca nu am nicio vraja preparata atunci va lovi cu 3, iar daca are vraji va lovi cu 12
        if (spells==0) {
            return 3;
        }
        spells--;
        return 12;
        }

        void prepareSpell(){
            spells++;
        }

        boolean isVulnerable() {
            return spells == 0;
        }

    }



}
