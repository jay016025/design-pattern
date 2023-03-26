package decorator.decorator;

import decorator.beverage.Beverage;

/**
 * 裝飾器: 豆漿
 */
public class Soy extends CondimentDecorator{

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return this.beverage.cost() + .15;
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription() + ", with soy";
    }
}
