package decorator.beverage;

/**
 * 深焙咖啡
 */
public class DarkRoast extends Beverage {

	public DarkRoast() {
		description = "Dark Roast Coffee";
	}
 
	public double cost() {
		return .99;
	}
}

