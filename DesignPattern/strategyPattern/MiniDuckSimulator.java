package strategyPattern;

import strategyPattern.abstractClass.Duck;
import strategyPattern.behaviorImpl.FlyRocketPowered;
import strategyPattern.behaviorImpl.FlyWithWings;
import strategyPattern.duckImpl.MallardDuck;
import strategyPattern.duckImpl.ModelDuck;

public class MiniDuckSimulator {

    public static void main(String[] args) {

        Duck modelDuck = new ModelDuck();
        modelDuck.performFly();
        modelDuck.setFlyBehavior(new FlyWithWings());
        modelDuck.performFly();

    }

}