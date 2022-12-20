package pattern.strategy.duckImpl;

import pattern.strategy.abstractClass.Duck;
import pattern.strategy.behaviorImpl.FlyWithWings;
import pattern.strategy.behaviorImpl.Quack;;

public class MallardDuck extends Duck {

    public MallardDuck() {

        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();

    }

    public void display() {

        System.out.println("Im a real Mallard Duck!");

    }

}
