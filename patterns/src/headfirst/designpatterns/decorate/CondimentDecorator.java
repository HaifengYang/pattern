package headfirst.designpatterns.decorate;

import sun.font.Decoration;

public abstract class CondimentDecorator extends Beverage {
    @Override
    public abstract String getDescription();
}
