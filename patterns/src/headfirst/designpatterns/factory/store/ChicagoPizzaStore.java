package headfirst.designpatterns.factory.store;

import headfirst.designpatterns.factory.ingredients.facotry.ChicagoPizzaIngredientFactory;
import headfirst.designpatterns.factory.ingredients.facotry.PizzaIngredientFactory;
import headfirst.designpatterns.factory.pizza.*;

public class ChicagoPizzaStore extends PizzaStore {

    PizzaIngredientFactory pizzaIngredientFactory = new ChicagoPizzaIngredientFactory();
    @Override
    protected Pizza createPizza(String type) {
        switch (type) {
            case "cheese":
                return new ChicagoStyleCheesePizza(pizzaIngredientFactory);
            case "clam":
                return new ChicagoStyleClamPizza(pizzaIngredientFactory);
            case "veggie":
                return new ChicagoStyleVeggiePizza(pizzaIngredientFactory);
            case "pepperoni":
                return new ChicagoStylePepperoniPizza(pizzaIngredientFactory);
        }
        return null;
    }
}
