package strategy.duck;

import strategy.fly_behavior.FlyBehavior;
import strategy.quack_behavior.QuackBehavior;

public class ModelDuck extends Duck{

    public ModelDuck() {}

    public ModelDuck(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
        this.flyBehavior = flyBehavior;
        this.quackBehavior = quackBehavior;
    }

    @Override
    public void display() {
        System.out.println("我是一隻模型鴨");
    }
}
