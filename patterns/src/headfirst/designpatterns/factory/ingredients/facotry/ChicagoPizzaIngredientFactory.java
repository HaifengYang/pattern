package headfirst.designpatterns.factory.ingredients.facotry;

import headfirst.designpatterns.factory.ingredients.ingredent.cheese.Cheese;
import headfirst.designpatterns.factory.ingredients.ingredent.cheese.ReggianoCheese;
import headfirst.designpatterns.factory.ingredients.ingredent.clams.Clams;
import headfirst.designpatterns.factory.ingredients.ingredent.clams.FreshClams;
import headfirst.designpatterns.factory.ingredients.ingredent.dough.Dough;
import headfirst.designpatterns.factory.ingredients.ingredent.dough.ThinCrustDough;
import headfirst.designpatterns.factory.ingredients.ingredent.pepperoni.Pepperoni;
import headfirst.designpatterns.factory.ingredients.ingredent.pepperoni.SlicedPepperoni;
import headfirst.designpatterns.factory.ingredients.ingredent.sauce.MarinaraSauce;
import headfirst.designpatterns.factory.ingredients.ingredent.sauce.Sauce;
import headfirst.designpatterns.factory.ingredients.ingredent.veggie.*;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory{
    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Clams createClams() {
        return new FreshClams();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies[] veggies = { new Garlic(), new Onion(), new Mushroom(), new RedPepper() };
        return veggies;
    }
}
