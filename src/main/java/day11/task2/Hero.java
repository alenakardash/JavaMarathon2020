package day11.task2;

public abstract class Hero implements PhysAttack {
    static final double MAX_HEALTH = 100.0;
    static final double MIN_HEALTH = 0;

    double health;
    double physDef;
    double magicDef;
    double physAtt;

    public Hero() {
        health = MAX_HEALTH;
    }


    public void setHealth(double health) {
        if (health > MAX_HEALTH) {
            this.health = MAX_HEALTH;
        } else if (health < MIN_HEALTH) {
            this.health = MIN_HEALTH;
        } else {
            this.health = health;
        }
    }

    @Override
    public String toString() {
        return "health = " + health;
    }

    @Override
    public void physicalAttack(Hero hero) {
        hero.setHealth(hero.health - (physAtt - hero.physDef * physAtt));
    }

}
