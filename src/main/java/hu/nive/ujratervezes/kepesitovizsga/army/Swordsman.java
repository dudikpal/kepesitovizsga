package hu.nive.ujratervezes.kepesitovizsga.army;

public class Swordsman extends MilitaryUnit{

    private boolean isProtected = true;

    public Swordsman(boolean shield) {
        super(100, 10, shield);
    }

    @Override
    void sufferDamage(int damage) {
        if (isProtected) {
            isProtected = false;
        } else {
            super.sufferDamage(damage);
        }
    }
}
