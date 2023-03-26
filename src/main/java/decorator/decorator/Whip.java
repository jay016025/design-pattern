package decorator.decorator;

import decorator.beverage.Beverage;

/**
 * 裝飾器: 奶泡
 */
public class Whip extends CondimentDecorator{

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return this.beverage.cost() + .10;
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription() + ", with whip";
    }
}
