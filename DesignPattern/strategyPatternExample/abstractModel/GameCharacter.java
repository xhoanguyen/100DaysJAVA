package strategyPatternExample.abstractModel;

import strategyPatternExample.behavior.WeaponBehavior;

public abstract class GameCharacter {

    protected WeaponBehavior weaponBehavior;

    public void setBehavior(WeaponBehavior w) {
        this.weaponBehavior = w;
    }

    public void fight() {
        weaponBehavior.useWeapon();

    }

}
