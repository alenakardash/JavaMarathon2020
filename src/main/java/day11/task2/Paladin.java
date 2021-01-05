package day11.task2;

public class Paladin extends Hero implements Healer {

    public Paladin() {
        super();
        health = MAX_HEALTH;
        physAtt = 15;
        physDef = 0.5;
        magicDef = 0.2;
    }

    @Override
    public void healHimself() {
        setHealth(health + 25);
    }

    @Override
    public void healTeammate(Hero hero) {
        hero.setHealth(hero.health + 10);
    }

}
