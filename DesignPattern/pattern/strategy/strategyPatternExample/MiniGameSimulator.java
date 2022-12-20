package pattern.strategy.strategyPatternExample;

import pattern.strategy.strategyPatternExample.abstractModel.*;
import pattern.strategy.strategyPatternExample.behavior.AxeBehavior;
import pattern.strategy.strategyPatternExample.behavior.BowAndArrowBehavior;
import pattern.strategy.strategyPatternExample.characters.*;

public class MiniGameSimulator {

    public static void main(String[] args) {

        GameCharacter knight = new Knight();
        GameCharacter queen = new Queen();
        GameCharacter king = new King();
        GameCharacter troll = new Troll();

        knight.fight();
        queen.fight();
        king.fight();
        troll.fight();

        king.setBehavior(new AxeBehavior());
        System.out.println("The King changed his weapon. He is using an axe");
        king.fight();

    }

}
