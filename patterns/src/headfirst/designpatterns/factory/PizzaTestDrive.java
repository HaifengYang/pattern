package headfirst.designpatterns.factory;

import headfirst.designpatterns.factory.pizza.Pizza;
import headfirst.designpatterns.factory.store.ChicagoPizzaStore;
import headfirst.designpatterns.factory.store.NYPizzaStore;
import headfirst.designpatterns.factory.store.PizzaStore;

public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore nyPizzaStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza nyStyleCheesePizza = nyPizzaStore.orderPizza("cheese");
        Pizza chicagoStyleCheesePizza = chicagoStore.orderPizza("cheese");

        System.out.println("Ethan ordered a " + nyStyleCheesePizza.getName());
        System.out.println("Joe order a " + chicagoStyleCheesePizza.getName());


    }
}
