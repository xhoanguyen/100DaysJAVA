package strategyPattern.duckImpl;

import strategyPattern.abstractClass.Duck;
import strategyPattern.behaviorImpl.FlyWithWings;
import strategyPattern.behaviorImpl.Quack;;

public class MallardDuck extends Duck {

    public MallardDuck() {

        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();

    }

    public void display() {

        System.out.println("Im a real Mallard Duck!");

    }

}
