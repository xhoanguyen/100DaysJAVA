package pattern.decorator;

public class MediumSize extends SizeDecorator {

    public MediumSize(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {

        return beverage.getDescription() + " " + Size.TALL;
    }

    public double cost() {

        return beverage.cost() + 1.55;

    }

}
