package strategyPatternExample;

import strategyPatternExample.abstractModel.*;
import strategyPatternExample.behavior.AxeBehavior;
import strategyPatternExample.behavior.BowAndArrowBehavior;
import strategyPatternExample.characters.*;

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
