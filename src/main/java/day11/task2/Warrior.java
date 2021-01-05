package day11.task2;

public class Warrior extends Hero implements PhysAttack {
    private double physAtt;

    public Warrior() {
        super();
        setHealth(super.MAX_HEALTH);
        physAtt = 30;
        setPhysDef(0.8);
    }

    @Override
    public void physicalAttack(Hero hero) {
        hero.setHealth(hero.getHealth() - (physAtt - hero.getPhysDef() * physAtt));
    }
}
