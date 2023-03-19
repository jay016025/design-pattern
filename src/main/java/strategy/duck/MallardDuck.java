package strategy.duck;

import strategy.fly_behavior.FlyBehavior;
import strategy.quack_behavior.QuackBehavior;

public class MallardDuck extends Duck{

    public MallardDuck() {}

    public MallardDuck(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
        this.flyBehavior = flyBehavior;
        this.quackBehavior = quackBehavior;
    }

    @Override
    public void display() {
        System.out.println("我是一隻常見的野鴨!!");
    }
}
