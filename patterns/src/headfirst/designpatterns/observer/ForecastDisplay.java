package headfirst.designpatterns.observer;

public class ForecastDisplay implements Observer, Display{

    private Subject subject;
    private float tmp;
    private float hum;
    private float pressure;

    public ForecastDisplay(Subject subject)
    {
        subject.register(this);
    }

    @Override
    public void update(float tmp, float hum, float pressure){
        this.tmp = tmp;
        this.hum = hum;
        this.pressure = pressure;
        display();        display();
    }

    @Override
    public void display() {
        System.out.println("ForecastDisplay: " + "tmp: " + tmp + ", hum " + hum + ", pressure " + pressure);
    }
}
