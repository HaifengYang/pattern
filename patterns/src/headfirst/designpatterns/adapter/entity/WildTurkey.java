package headfirst.designpatterns.adapter.entity;

import headfirst.designpatterns.adapter.interfaces.Turkey;

public class WildTurkey implements Turkey {
    @Override
    public void gobble() {
        System.out.println("Gobble gobble!");
    }

    @Override
    public void fly() {
        System.out.println("fly 1 foot.");
    }
}
