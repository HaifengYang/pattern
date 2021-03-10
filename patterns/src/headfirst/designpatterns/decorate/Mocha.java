package headfirst.designpatterns.decorate;

import sun.font.Decoration;

public class Mocha extends CondimentDecorator{
    private Beverage beverage;

    public Mocha(Beverage beverage)
    {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return 0.2 + this.beverage.cost();
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription() + ", Mocha";
    }
}
