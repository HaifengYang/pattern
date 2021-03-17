package headfirst.designpatterns.adapter.test;

import headfirst.designpatterns.adapter.adapter.DuckAdapter;
import headfirst.designpatterns.adapter.entity.MallardDuck;
import headfirst.designpatterns.adapter.entity.WildTurkey;
import headfirst.designpatterns.adapter.interfaces.Duck;

public class Test {
    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();

        Duck duckAdapter = new DuckAdapter(new WildTurkey());

        test(mallardDuck);
        test(duckAdapter);
    }

    private static void test(Duck duck) {
        duck.quack();
        duck.fly();
        System.out.println("--------------");
    }
}
