package org.skillbrain.cristianLuca.Tema3;

abstract class Fighter {
    boolean isVulnerable() {
        return false;
    }

    abstract int damagePoints(Fighter fighter);
}

class Warrior extends Fighter {
    @Override
    public String toString() {
        return "Fighter is a Warrior";
    }

    @Override
    int damagePoints(Fighter wizard) {
        return wizard.isVulnerable() ? 10 : 6;
    }
}

class Wizard extends Fighter {
    boolean prepare = false;

    @Override
    boolean isVulnerable() {
        boolean isVulnerable = !this.prepare;
        return isVulnerable;
    }

    @Override
    int damagePoints(Fighter warrior) {
        return this.prepare ? 12 : 3;
    }

    void prepareSpell() {
        this.prepare = true;
    }

    @Override
    public String toString() {
        return "Fighter is a Wizard";
    }
}
