package headfirst.designpatterns.observer;

public class Test {
    public static void main(String[] args) {
        Subject station = new WeatheStation();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(station);
        ForecastDisplay forecastDisplay = new ForecastDisplay(station);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(station);
        station.notifyObservers(2, 3, 4);
    }
}
