package pattern.strategy.behaviorImpl;

import pattern.strategy.behaviorInterface.FlyBehavior;

public class FlyNoWay implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("I can not fly.");

    }

}
