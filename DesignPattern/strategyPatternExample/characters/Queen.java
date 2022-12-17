package strategyPatternExample.characters;

import strategyPatternExample.abstractModel.GameCharacter;
import strategyPatternExample.behavior.*;

public class Queen extends GameCharacter {

    public Queen() {
        weaponBehavior = new BowAndArrowBehavior();
    }

    public void fight() {
        weaponBehavior.useWeapon();
    }

}
