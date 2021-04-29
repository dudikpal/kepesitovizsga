package hu.nive.ujratervezes.kepesitovizsga.army;

public class HeavyCavalry extends MilitaryUnit{

    private boolean isFirstAttack = true;

    public HeavyCavalry() {
        super(150, 20, true);
    }

    @Override
    int doDamage() {
        if (isFirstAttack) {
            isFirstAttack = false;
            return doDamage() * 3;
        } else {
            return super.doDamage();
        }
    }
}
