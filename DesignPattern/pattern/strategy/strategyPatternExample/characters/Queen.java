package pattern.strategy.strategyPatternExample.characters;

import pattern.strategy.strategyPatternExample.abstractModel.GameCharacter;
import pattern.strategy.strategyPatternExample.behavior.*;

public class Queen extends GameCharacter {

    public Queen() {
        weaponBehavior = new BowAndArrowBehavior();
    }

    public void fight() {
        weaponBehavior.useWeapon();
    }

}
