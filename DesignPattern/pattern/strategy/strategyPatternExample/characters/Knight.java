package pattern.strategy.strategyPatternExample.characters;

import pattern.strategy.strategyPatternExample.abstractModel.GameCharacter;
import pattern.strategy.strategyPatternExample.behavior.KnifeBehavior;

public class Knight extends GameCharacter {

    public Knight() {

        weaponBehavior = new KnifeBehavior();
    }

    public void fight() {
        weaponBehavior.useWeapon();
    }

}
