package pattern.strategy.duckImpl;

import pattern.strategy.abstractClass.Duck;
import pattern.strategy.behaviorImpl.FlyNoWay;
import pattern.strategy.behaviorImpl.Quack;

public class ModelDuck extends Duck {

    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    public void display() {
        System.out.println("I'm a model duck.");

    }

}
