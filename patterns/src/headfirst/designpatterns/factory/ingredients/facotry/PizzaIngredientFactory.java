package headfirst.designpatterns.factory.ingredients.facotry;

import headfirst.designpatterns.factory.ingredients.ingredent.cheese.Cheese;
import headfirst.designpatterns.factory.ingredients.ingredent.clams.Clams;
import headfirst.designpatterns.factory.ingredients.ingredent.dough.Dough;
import headfirst.designpatterns.factory.ingredients.ingredent.pepperoni.Pepperoni;
import headfirst.designpatterns.factory.ingredients.ingredent.sauce.Sauce;
import headfirst.designpatterns.factory.ingredients.ingredent.veggie.Veggies;

public interface PizzaIngredientFactory {
    Dough createDough();
    Clams createClams();
    Cheese createCheese();
    Pepperoni createPepperoni();
    Sauce createSauce();
    Veggies[]    createVeggies();
}
