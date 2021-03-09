package headfirst.designpatterns.observer;

public class CurrentConditionsDisplay implements Observer, Display {

    private Subject subject;
    private float tmp;
    private float hum;
    private float pressure;

    public CurrentConditionsDisplay(Subject subject) {
        subject.register(this);
    }

    @Override
    public void update(float tmp, float hum, float pressure) {
        this.tmp = tmp;
        this.hum = hum;
        this.pressure = pressure;
        display();
    }

    @Override
    public void display() {
        System.out.println("CurrentConditionsDisplay: " + "tmp: " + tmp + ", hum " + hum + ", pressure " + pressure);
    }
}
