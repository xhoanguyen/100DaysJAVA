package pattern.decorator;

public class SmallSize extends SizeDecorator {

    public SmallSize(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {

        return beverage.getDescription() + " " + Size.GRANDE;
    }

    public double cost() {

        return beverage.cost() + .95;

    }

}
