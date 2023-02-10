package org.skillbrain.alexandraNegulescu.Tema_3;
abstract class Fighter{
    private boolean vulnerable = false;
    public boolean isVulnerable(){
        return vulnerable;
    }
    abstract int damagePoints(Fighter fighter);
@Override
    public String toString(){
    return "Fighter is a " + this.getClass().getSimpleName();
}
}

class Warrior extends Fighter {
    @Override
    public int damagePoints(Fighter target) {
        if (target.isVulnerable()) {
            return 10;
        } else {
            return 6;
        }
    }

    public static void main(String[] args) {
        Fighter warrior = new Warrior();
        System.out.println(warrior);
    }
}

class Wizard extends Fighter {
    private boolean spellPrepared = false;
    public void prepareSpell() {
        spellPrepared = true;
    }

    public static void main(String[] args) {
        Wizard wizard = new Wizard();
        System.out.println(wizard);
    }
    @Override
    public boolean isVulnerable() {
        return !spellPrepared;
    }

    @Override
    public int damagePoints(Fighter warrior) {
        if (spellPrepared) {
            return 12;
        } else {
            return 3;
        }
    }

}




