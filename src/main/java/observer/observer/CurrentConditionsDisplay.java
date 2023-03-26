package observer.observer;

import observer.observer.DisplayComponent;
import observer.observer.Observer;
import observer.subject.WeatherData;

/**
 * 觀察者、顯示器: 目前資訊顯示(溫度、濕度)
 * 參考: 深入淺出設計模式
 */
public class CurrentConditionsDisplay implements Observer, DisplayComponent {

    private float temperature;

    private float humidity;

    private final WeatherData weatherData;

    public CurrentConditionsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.register(this);
    }

    @Override
    public void display() {
        System.out.printf("Current conditions: %f F degrees and %f %% humidity\n", temperature, humidity);
    }

    @Override
    public void update() {
        this.temperature = weatherData.getTemperature();
        this.humidity = weatherData.getHumidity();
        display();
    }
}
