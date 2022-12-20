package pattern.decorator;

public class Mocha extends CondimentDecorator {

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {

        return beverage.getDescription() + ", Mocha";
    }

    public double cost() {

        return beverage.cost() + .20;

    }

}
