package day11.task2;

public abstract class Hero {
    public static final double MAX_HEALTH = 100.0;
    public static final double MIN_HEALTH = 0;

    private double health;
    private double physDef;
    private double magicDef;

    public double getHealth() {
        return health;
    }

    public void setHealth(double health) {
        if (health > 100) {
            this.health = 100;
        } else if (health < 0) {
            this.health = 0;
        } else {
            this.health = health;
        }
    }

    public double getPhysDef() {
        return physDef;
    }

    public void setPhysDef(double physDef) {
        this.physDef = physDef;
    }

    public double getMagicDef() {
        return magicDef;
    }

    public void setMagicDef(double magicDef) {
        this.magicDef = magicDef;
    }

    @Override
    public String toString() {
        return "health = " + health;
    }
}
