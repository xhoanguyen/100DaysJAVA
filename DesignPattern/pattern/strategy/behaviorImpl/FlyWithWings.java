package pattern.strategy.behaviorImpl;

import pattern.strategy.behaviorInterface.FlyBehavior;

public class FlyWithWings implements FlyBehavior {

    @Override
    public void fly() {

        System.out.println("I'm flying with my wings!");

    }

}
