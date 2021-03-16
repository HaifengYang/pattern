package headfirst.designpatterns.factory.pizza;

import headfirst.designpatterns.factory.ingredients.facotry.PizzaIngredientFactory;

public class ChicagoStyleCheesePizza extends Pizza{
    PizzaIngredientFactory ingredientFactory;

    public ChicagoStyleCheesePizza(PizzaIngredientFactory ingredientFactory){
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
    }
    public void cut(){
        System.out.println("Cut pizza into square slice");
    }
}
