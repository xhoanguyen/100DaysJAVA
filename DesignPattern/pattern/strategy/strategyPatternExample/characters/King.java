package pattern.strategy.strategyPatternExample.characters;

import pattern.strategy.strategyPatternExample.abstractModel.GameCharacter;
import pattern.strategy.strategyPatternExample.behavior.SwordBehavior;

public class King extends GameCharacter {

    public King() {
        weaponBehavior = new SwordBehavior();
    }

    public void fight() {

        weaponBehavior.useWeapon();

    }

}
