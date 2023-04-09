package org.skillbrain.crinaSas.JavaBasics3;

public abstract class Fighter {
    abstract int damagePoints(Fighter fighter);

    boolean isVulnerable() {
        return false;
    }

    public String toString() {
        return "Figher is " + this.getClass().getSimpleName();
    }

    public static void main(String[] args) {
        Fighter warrior = new Warrior();
        System.out.println(warrior);
    }

    static class Warrior extends Fighter {
        @Override
        boolean isVulnerable() {
            return true;
        }


        int damagePoints(Fighter fighter) {
            return fighter.isVulnerable() ? 10 : 6;
        }

        public static void main(String[] args) {
            Fighter warrior = new Warrior();
            Fighter wizard = new Wizard();
            ((Wizard)wizard).prepareSpell();
            System.out.println(warrior.damagePoints(wizard));
            System.out.println(wizard.damagePoints(warrior));
            System.out.println("Dupa vraja");
            System.out.println(warrior.damagePoints(wizard));
            System.out.println(wizard.damagePoints(warrior));

        }
    }

    static class Wizard extends Fighter {

        private int spells;

        boolean isVulnerable() {
            return spells == 0;
        }

        public void prepareSpell() {
            spells++;
        }

        @Override
        int damagePoints(Fighter fighter) {
            if(spells == 0) {
                return 3;
            }
            spells--;
            return 12;
        }
    }

}

