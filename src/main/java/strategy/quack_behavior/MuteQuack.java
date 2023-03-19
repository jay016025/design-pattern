package strategy.quack_behavior;

public class MuteQuack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("<< 安靜... >>");
    }
}
