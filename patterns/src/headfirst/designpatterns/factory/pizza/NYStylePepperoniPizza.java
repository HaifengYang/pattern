package headfirst.designpatterns.factory.pizza;

import headfirst.designpatterns.factory.ingredients.facotry.PizzaIngredientFactory;

public class NYStylePepperoniPizza extends Pizza{
    PizzaIngredientFactory ingredientFactory;

    public NYStylePepperoniPizza(PizzaIngredientFactory ingredientFactory){
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
    }
}
