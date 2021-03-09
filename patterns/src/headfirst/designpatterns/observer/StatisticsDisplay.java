package headfirst.designpatterns.observer;

public class StatisticsDisplay implements Observer, Display{

    private Subject subject;
    private float tmp;
    private float hum;
    private float pressure;

    public StatisticsDisplay(Subject subject)
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
        System.out.println("StatisticsDisplay: " + "tmp: " + tmp + ", hum " + hum + ", pressure " + pressure);
    }
}
