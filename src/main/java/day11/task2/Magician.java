package day11.task2;

public class Magician extends Hero implements MagicAttack {
    private double magicAtt;

    public Magician() {
        super();
        physAtt = 5;
        magicAtt = 20;
        magicDef = 0.8;
    }

    @Override
    public void magicalAttack(Hero hero) {
        hero.setHealth(hero.health - (magicAtt - hero.magicDef * magicAtt));

    }
}
