package strategyPatternExample.characters;

import strategyPatternExample.abstractModel.GameCharacter;
import strategyPatternExample.behavior.SwordBehavior;

public class King extends GameCharacter {

    public King() {
        weaponBehavior = new SwordBehavior();
    }

    public void fight() {

        weaponBehavior.useWeapon();

    }

}
