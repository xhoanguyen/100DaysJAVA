package strategyPattern.abstractClass;

import strategyPattern.behaviorInterface.FlyBehavior;
import strategyPattern.behaviorInterface.QuackBehavior;

public abstract class Duck {

    protected FlyBehavior flyBehavior;
    protected QuackBehavior quackBehavior;

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

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
