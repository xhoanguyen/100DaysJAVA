package strategyPatternExample.characters;

import strategyPatternExample.abstractModel.GameCharacter;
import strategyPatternExample.behavior.KnifeBehavior;

public class Knight extends GameCharacter {

     

    public Knight(){

        weaponBehavior = new KnifeBehavior();
    }

    public void fight() {
        weaponBehavior.useWeapon();
    }

}
