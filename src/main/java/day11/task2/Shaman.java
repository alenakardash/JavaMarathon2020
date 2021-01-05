package day11.task2;

public class Shaman extends Hero implements Healer, PhysAttack, MagicAttack {
    private double physAtt;
    private double magicAtt;

    public Shaman() {
        super();
        setHealth(super.MAX_HEALTH);
        physAtt = 10;
        magicAtt = 15;
        setMagicDef(0.2);
        setPhysDef(0.2);
    }

    @Override
    public void healHimself() {
        setHealth(getHealth() + 50);

    }

    @Override
    public void healTeammate(Hero hero) {
        hero.setHealth(hero.getHealth() + 30);

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
