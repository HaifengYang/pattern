package headfirst.designpatterns.decorate;

public class Whip extends CondimentDecorator{
    private Beverage beverage;

    public Whip(Beverage beverage)
    {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return 0.1 + this.beverage.cost();
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription() + ", Whip";
    }
}

