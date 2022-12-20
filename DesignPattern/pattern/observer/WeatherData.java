package pattern.observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {

    private List<Observer> observers;
    public float temperature;
    public float humidity;
    public float pressure;

    public WeatherData() {

        observers = new ArrayList<>();

    }

    public float getPressure() {
        return pressure;
    }

    @Override
    public void registerObserver(Observer o) {

        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {

        observers.remove(o);
    }

    @Override
    public void notifyObserver() {

        for (Observer observer : observers) {

            observer.update();

        }
    }

    public void measurementChanged() {

        notifyObserver();

    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementChanged();
    }

    public float getTemperature() {
        return this.temperature;
    }

    public float getHumidity() {
        return this.humidity;
    }

}
