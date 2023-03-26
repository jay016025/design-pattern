package observer.subject;


import observer.observer.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * subject 天氣資料
 * 參考 深入淺出設計模式
 */
public class WeatherData implements Subject{

    private List<Observer> observers;

    // 溫度
    private float temperature;

    // 濕度
    private float humidity;

    // 壓力
    private float pressure;

    public WeatherData() {
        observers = new ArrayList<>();
    }

    @Override
    public void register(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void remove(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer : observers) {
            observer.update();
        }
    }

    /**
     * 當天氣測量資料更新
     */
    public void measurementsChanged() {
        notifyObservers();
    }

    /**
     * 設定新的天氣測量資料
     * @param temperature
     * @param humidity
     * @param pressure
     */
    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;

        measurementsChanged();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
