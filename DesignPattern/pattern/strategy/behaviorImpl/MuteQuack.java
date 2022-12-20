package pattern.strategy.behaviorImpl;

import pattern.strategy.behaviorInterface.QuackBehavior;

public class MuteQuack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("<<Silence!>>");

    }

}
