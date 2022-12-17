package strategyPattern.abstractClass;

import strategyPattern.behaviorInterface.FlyBehavior;
import strategyPattern.behaviorInterface.QuackBehavior;

public class Duck {

    protected FlyBehavior flyBehavior;
    protected QuackBehavior quackBehavior;

    public Duck() {
    }

    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();

    }

    public void swim() {

        System.out.println("All ducks floats, even decoys!");
    }
}
