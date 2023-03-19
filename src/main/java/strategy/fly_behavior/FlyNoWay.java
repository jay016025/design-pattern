package strategy.fly_behavior;

public class FlyNoWay implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("我不會飛!!");
    }
}
