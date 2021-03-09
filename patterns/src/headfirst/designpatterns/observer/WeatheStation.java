package headfirst.designpatterns.observer;

import java.util.ArrayList;
import java.util.List;

public class WeatheStation implements Subject{

    private List<Observer> observers;
    private float tmp;
    private float hum;
    private float pressure;

    public WeatheStation()
    {
        observers = new ArrayList<>();
    }

    @Override
    public void register(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void unregister(Observer observer) {
        observers.remove(observer);
    }


    @Override
    public void notifyObservers(float tmp, float hum, float pressure) {
        this.tmp = tmp;
        this.hum = hum;
        this.pressure = pressure;
        observers.forEach(observer -> observer.update(tmp, hum, pressure));
    }

    public float getTmp() {
        return tmp;
    }

    public float getHum() {
        return hum;
    }

    public float getPressure() {
        return pressure;
    }
}

