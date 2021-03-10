package headfirst.designpatterns.decorate;

public abstract class Beverage {
    protected String description = "Unknown Beverage";

    protected String getDescription(){
        return description;
    }

    public abstract double cost();
}
