package day11.task2;

public class Warrior extends Hero implements PhysAttack {

    public Warrior() {
        super();
        health = MAX_HEALTH;
        physAtt = 30;
        physDef = 0.8;
    }
}
