package headfirst.designpatterns.factory.pizza;

import headfirst.designpatterns.factory.ingredients.facotry.PizzaIngredientFactory;

public class NYStyleClamPizza extends Pizza{
    PizzaIngredientFactory ingredientFactory;

    public NYStyleClamPizza(PizzaIngredientFactory ingredientFactory){
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    void prepare() {
        System.out.println("Preparing " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
    }
}
