package observer;

import observer.observer.CurrentConditionsDisplay;
import observer.observer.ForecastDisplay;
import observer.observer.StatisticsDisplay;
import observer.subject.WeatherData;

public class WeatherStation {

    public static void main(String[] args) {

        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.3f);
        weatherData.setMeasurements(82, 73, 30.4f);
        weatherData.setMeasurements(78, 66, 30.6f);
    }
}
