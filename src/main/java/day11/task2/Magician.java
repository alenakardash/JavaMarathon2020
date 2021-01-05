package day11.task2;

public class Magician extends Hero implements PhysAttack, MagicAttack {
    private double physAtt;
    private double magicAtt;

    public Magician() {
        super();
        setHealth(super.MAX_HEALTH);
        physAtt = 5;
        magicAtt = 20;
        setMagicDef(0.8);
    }

    @Override
    public void physicalAttack(Hero hero) {
        hero.setHealth(hero.getHealth() - (physAtt - hero.getPhysDef() * physAtt));
    }

    @Override
    public void magicalAttack(Hero hero) {
        hero.setHealth(hero.getHealth() - (magicAtt - hero.getMagicDef() * magicAtt));

    }
}
