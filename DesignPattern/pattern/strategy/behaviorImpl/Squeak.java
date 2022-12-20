package pattern.strategy.behaviorImpl;

import pattern.strategy.behaviorInterface.QuackBehavior;

public class Squeak implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("Squeak!");

    }

}
