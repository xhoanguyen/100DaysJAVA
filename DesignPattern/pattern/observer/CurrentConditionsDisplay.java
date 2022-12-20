package pattern.observer;

public class CurrentConditionsDisplay implements Observer, DisplayElements {

    public float temperature;
    public float humidity;
    public WeatherData weatherData;

    public CurrentConditionsDisplay(WeatherData weatherData) {

        this.weatherData = weatherData;
        weatherData.registerObserver(this);

    }

    @Override
    public void display() {
        System.out.println("Current condition: " + temperature + "F degrees and " + humidity + "% humidity");
    }

    @Override
    public void update() {
        this.temperature = weatherData.getTemperature();
        this.humidity = weatherData.getHumidity();
        display();

    }

}
