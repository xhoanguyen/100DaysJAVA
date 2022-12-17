package strategyPatternExample.characters;

import strategyPatternExample.abstractModel.GameCharacter;
import strategyPatternExample.behavior.*;

public class Troll extends GameCharacter {

    public Troll() {

        weaponBehavior = new KnifeBehavior();

    }

    public void fight() {

        weaponBehavior.useWeapon();

    }

}
