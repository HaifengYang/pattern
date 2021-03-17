package headfirst.designpatterns.adapter.adapter;

import headfirst.designpatterns.adapter.interfaces.Duck;
import headfirst.designpatterns.adapter.interfaces.Turkey;

public class DuckAdapter implements Duck {
    private Turkey turkey;

    public DuckAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        turkey.gobble();
    }

    @Override
    public void fly() {
        for (int i = 0; i < 5; i++) {
            turkey.fly();
        }
    }
}
