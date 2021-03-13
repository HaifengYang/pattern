package headfirst.designpatterns.factory.store;

import headfirst.designpatterns.factory.ingredients.facotry.NYPizzaIngredientFactory;
import headfirst.designpatterns.factory.pizza.*;

public class NYPizzaStore extends PizzaStore {
    NYPizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();
    @Override
    protected Pizza createPizza(String type) {
        switch (type) {
            case "cheese":
                return new NYStyleCheesePizza(ingredientFactory);
            case "clam":
                return new NYStyleClamPizza(ingredientFactory);
            case "veggie":
                return new NYStyleVeggiePizza(ingredientFactory);
            case "pepperoni":
                return new NYStylePepperoniPizza(ingredientFactory);
        }
        return null;
    }
}
