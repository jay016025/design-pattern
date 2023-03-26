package decorator.decorator;

import decorator.beverage.Beverage;

/**
 * 調味品裝飾器
 */
public abstract class CondimentDecorator extends Beverage {

    // 要裝飾的飲料類別
    protected Beverage beverage;

    public abstract String getDescription();

}
