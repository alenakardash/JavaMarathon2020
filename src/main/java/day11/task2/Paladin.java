package day11.task2;

public class Paladin extends Hero implements Healer, PhysAttack {
    private double physAtt;

    public Paladin() {
        super();
        setHealth(super.MAX_HEALTH);
        physAtt = 15;
        setPhysDef(0.5);
        setMagicDef(0.2);
    }

    @Override
    public void healHimself() {
        setHealth(getHealth() + 25);
    }

    @Override
    public void healTeammate(Hero hero) {
        hero.setHealth(hero.getHealth() + 10);
    }

    @Override
    public void physicalAttack(Hero hero) {
        hero.setHealth(hero.getHealth() - (physAtt - hero.getPhysDef() * physAtt));

    }
}
