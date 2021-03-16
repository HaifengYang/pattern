package headfirst.designpatterns.factory.pizza;

import headfirst.designpatterns.factory.ingredients.ingredent.cheese.Cheese;
import headfirst.designpatterns.factory.ingredients.ingredent.clams.Clams;
import headfirst.designpatterns.factory.ingredients.ingredent.dough.Dough;
import headfirst.designpatterns.factory.ingredients.ingredent.pepperoni.Pepperoni;
import headfirst.designpatterns.factory.ingredients.ingredent.sauce.Sauce;
import headfirst.designpatterns.factory.ingredients.ingredent.veggie.Veggies;

public abstract class Pizza {
    String name;
    Dough dough;
    Sauce sauce;
    Veggies veggies[];
    Cheese cheese;
    Pepperoni pepperoni;
    Clams clam;
    public abstract void prepare();
    public void bake(){
        System.out.println("Bake 25 minutes at 350");
    }
    public void cut(){
        System.out.println("Cutting pazzia into diagonal slice");
    }
    public void box(){
        System.out.println("Place pizza into official box");
    }

    public String getName(){
        return name;
    }

}
