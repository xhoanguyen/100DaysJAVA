package pattern.decorator;

public class BigSize extends SizeDecorator {

    public BigSize(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {

        return beverage.getDescription() + " " + Size.VENTI;
    }

    public double cost() {

        return beverage.cost() + 2.00;

    }

}
