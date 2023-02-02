package Tema3;
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
    int damagePoints(Fighter other) {
        return other.isVulnerable() ? 10 : 6;
    }
}
class Wizard extends Fighter {
    boolean preparedASpell = false;
    @Override
    boolean isVulnerable() {
        return !preparedASpell;
    }
    @Override
    int damagePoints(Fighter warrior) {
        return preparedASpell ? 12 : 3;
    }
    void prepareSpell() {
        preparedASpell = true;
    }
    @Override
    public String toString() {
        return "Fighter is a Wizard";
    }
}