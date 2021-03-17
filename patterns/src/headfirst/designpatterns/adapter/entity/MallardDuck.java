package headfirst.designpatterns.adapter.entity;

import headfirst.designpatterns.adapter.interfaces.Duck;

public class MallardDuck implements Duck {
    @Override
    public void quack() {
        System.out.println("quack");
    }

    @Override
    public void fly() {
        System.out.println("fly 5 feet.");
    }
}
