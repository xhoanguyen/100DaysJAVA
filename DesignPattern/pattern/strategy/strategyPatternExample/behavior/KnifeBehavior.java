package pattern.strategy.strategyPatternExample.behavior;

public class KnifeBehavior implements WeaponBehavior {

    @Override
    public void useWeapon() {
        System.out.println("Use Knife..");

    }

}
