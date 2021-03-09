package headfirst.designpatterns.observer;

public interface Subject {
    void register (Observer observer);
    void unregister(Observer observer);
    void notifyObservers(float tmp, float hum, float pressure);
}
