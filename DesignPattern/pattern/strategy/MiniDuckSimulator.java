package pattern.strategy;

import pattern.strategy.abstractClass.Duck;
import pattern.strategy.behaviorImpl.FlyRocketPowered;
import pattern.strategy.behaviorImpl.FlyWithWings;
import pattern.strategy.duckImpl.MallardDuck;
import pattern.strategy.duckImpl.ModelDuck;

public class MiniDuckSimulator {

    public static void main(String[] args) {

        Duck modelDuck = new ModelDuck();
        modelDuck.performFly();
        modelDuck.setFlyBehavior(new FlyWithWings());
        modelDuck.performFly();

    }

}