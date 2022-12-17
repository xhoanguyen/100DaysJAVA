package strategyPattern.behaviorImpl;

import strategyPattern.behaviorInterface.FlyBehavior;

public class FlyWithWings implements FlyBehavior {

    @Override
    public void fly() {

        System.out.println("I'm flying!");

    }

}
