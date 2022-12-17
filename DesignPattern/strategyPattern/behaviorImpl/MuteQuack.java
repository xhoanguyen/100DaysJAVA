package strategyPattern.behaviorImpl;

import strategyPattern.behaviorInterface.QuackBehavior;

public class MuteQuack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("<<Silence!>>");

    }

}
