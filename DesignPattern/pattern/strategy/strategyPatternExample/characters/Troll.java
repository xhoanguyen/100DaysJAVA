package pattern.strategy.strategyPatternExample.characters;

import pattern.strategy.strategyPatternExample.abstractModel.GameCharacter;
import pattern.strategy.strategyPatternExample.behavior.*;

public class Troll extends GameCharacter {

    public Troll() {

        weaponBehavior = new KnifeBehavior();

    }

    public void fight() {

        weaponBehavior.useWeapon();

    }

}
