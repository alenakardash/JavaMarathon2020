package day11.task2;

public class Shaman extends Hero implements Healer, MagicAttack {
    private double magicAtt;

    public Shaman() {
        super();
        physAtt = 10;
        magicAtt = 15;
        magicDef = 0.2;
        physDef = 0.2;
    }

    @Override
    public void healHimself() {
        setHealth(health + 50);

    }

    @Override
    public void healTeammate(Hero hero) {
        hero.setHealth(hero.health + 30);

    }

    @Override
    public void magicalAttack(Hero hero) {
        hero.setHealth(hero.health - (magicAtt - hero.magicDef * magicAtt));

    }
}
