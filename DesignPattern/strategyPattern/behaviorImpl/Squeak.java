package strategyPattern.behaviorImpl;

import strategyPattern.behaviorInterface.QuackBehavior;

public class Squeak implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("Squeak!");

    }

}
