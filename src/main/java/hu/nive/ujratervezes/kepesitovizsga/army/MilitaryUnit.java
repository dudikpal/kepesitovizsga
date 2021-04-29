package hu.nive.ujratervezes.kepesitovizsga.army;

public abstract class MilitaryUnit {

    private int hitPoints;
    private int damage;
    private boolean shield;

    public MilitaryUnit(int hitPoints, int damage, boolean shield) {
        this.hitPoints = hitPoints;
        this.damage = damage;
        this.shield = shield;
    }

    int doDamage() {
        return damage;
    };

    public int getHitPoints() {
        return hitPoints;
    }

    void sufferDamage(int damage) {
        if (shield) {
            hitPoints -= damage / 2;
        } else {
            hitPoints -= damage;
        }


    };


}
