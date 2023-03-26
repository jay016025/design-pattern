package decorator.decorator;

import decorator.beverage.Beverage;

/**
 * 裝飾器 摩卡
 */
public class Mocha  extends CondimentDecorator{

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return this.beverage.cost() + .20;
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription() + ", with Mocha";
    }
}
