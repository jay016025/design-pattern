package strategy.duck;

import strategy.fly_behavior.FlyBehavior;
import strategy.quack_behavior.QuackBehavior;

public abstract class Duck {

    FlyBehavior flyBehavior;

    QuackBehavior quackBehavior;

    /**
     * 抽象，每種鴨子有自己的外表
     */
    public abstract void display();

    /**
     * 委託 fly behavior 實作
     */
    public void performFly() {
        this.flyBehavior.fly();
    }

    /**
     * 委託 quack behavior 實作
     */
    public void performQuack() {
        this.quackBehavior.quack();
    }

    /**
     * 執行期間動態改變飛行行為
     * @param flyBehavior
     */
    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    /**
     * 執行期間動態改變叫聲
     * @param quackBehavior
     */
    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
