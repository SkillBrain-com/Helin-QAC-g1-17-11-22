package org.skillbrain.danaCatavei.JavaBasics3.Wizards_and_Worriors;

class Wizard extends Fighter {
    private int spells;

    @Override
    boolean isVulnerable() {
        return spells == 0;
    }

    @Override
    int damagePoints(Fighter warrior) {
        if (spells == 0) {
            return 3;
        }
        spells -= 1;
        return 12;
    }

    void prepareSpell() {
        spells += 1;
    }

}
