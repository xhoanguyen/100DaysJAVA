package strategyPattern.behaviorImpl;

import strategyPattern.behaviorInterface.QuackBehavior;

public class Quack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("QUACK QUACK!");

    }

}
