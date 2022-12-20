package pattern.strategy.behaviorImpl;

import pattern.strategy.behaviorInterface.QuackBehavior;

public class Quack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("QUACK QUACK!");

    }

}
