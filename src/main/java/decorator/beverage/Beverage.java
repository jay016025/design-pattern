package decorator.beverage;

/**
 * 裝飾氣模式
 * 抽象父類別: 飲料
 *
 * 參考: 深入淺出設計模式
 */
public abstract class Beverage {

    protected String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
