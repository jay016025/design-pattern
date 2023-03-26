package observer.observer;

import observer.subject.WeatherData;

/**
 * 觀察者、顯示器: 統計顯示
 * 參考: 深入淺出設計模式
 */
public class StatisticsDisplay implements Observer, DisplayComponent {
	private float maxTemp;
	private float minTemp = 200;
	private float tempSum;
	private int numReadings;
	private final WeatherData weatherData;

	public StatisticsDisplay(WeatherData weatherData) {
		this.weatherData = weatherData;
		weatherData.register(this);
	}

	@Override
	public void update() {

		float temp = weatherData.getTemperature();
		tempSum += temp;
		numReadings++;

		maxTemp = Math.max(temp, maxTemp);
		minTemp = Math.min(temp, minTemp);

		display();
	}

	public void display() {
		System.out.printf("Avg/Max/Min temperature = %f / %f / %f \n", (tempSum / numReadings), maxTemp, minTemp);
	}
}
