package org.skillbrain.teodorRadulescu.temaJava3;

abstract class Fighter {
    boolean isVulnerable() {
        return false;
    }

    abstract int damagePoints(Fighter fighter);

    // Aceasta metoda toString() ar trebui sa fi suprascrisa in clasele warrior si wizard pentru a afisa tipul de clasa in momentul in care il instantiam
    public String toString() {
        return String.format("Fighter class");
    }

    class Warrior extends Fighter {
        @Override
        public String toString() {
            return String.format("Fighter is a Warrior");
        }

        @Override
        int damagePoints(Fighter fighter) {
            return fighter.isVulnerable() ? 10 : 6;
        }
    }

    class Wizard extends Fighter {
        @Override
        public String toString() {
            return String.format("Fighter is a Wizard");
        }

        private boolean prepareSpell = false;

        @Override
        boolean isVulnerable() {
            return !prepareSpell;
        }

        @Override
        int damagePoints(Fighter warrior) {
            return prepareSpell ? 12 : 3;
        }

        void prepareSpell() {
            prepareSpell = true;
        }
    }
}
