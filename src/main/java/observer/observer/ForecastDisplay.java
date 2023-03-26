package observer.observer;

import observer.subject.WeatherData;

/**
 * 觀察者、顯示器: 預測顯示
 * 參考: 深入淺出設計模式
 */
public class ForecastDisplay implements Observer, DisplayComponent {

	private float currentPressure = 29.92f;  

	private float lastPressure;

	private WeatherData weatherData;

	public ForecastDisplay(WeatherData weatherData) {
		this.weatherData = weatherData;
		weatherData.register(this);
	}

	@Override
	public void update() {
		this.lastPressure = weatherData.getPressure();
		display();
	}

	public void display() {
		System.out.print("Forecast: ");
		if (currentPressure > lastPressure) {
			System.out.println("Improving weather on the way!");
		} else if (currentPressure == lastPressure) {
			System.out.println("More of the same");
		} else if (currentPressure < lastPressure) {
			System.out.println("Watch out for cooler, rainy weather");
		}
	}
}
