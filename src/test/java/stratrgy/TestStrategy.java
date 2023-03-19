package stratrgy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import strategy.duck.Duck;
import strategy.duck.MallardDuck;
import strategy.duck.ModelDuck;
import strategy.fly_behavior.FlyNoWay;
import strategy.fly_behavior.FlyWithWings;
import strategy.quack_behavior.MuteQuack;
import strategy.quack_behavior.Quack;
import strategy.quack_behavior.Squeak;

@DisplayName("測試策略模式")
public class TestStrategy {


    @Test
    @DisplayName("測試野鴨")
    public void mallardDuckTest() {

        // arrange
        Duck mallardDuck = new MallardDuck(new FlyWithWings(), new Quack());

        // ack
        mallardDuck.performFly();
        mallardDuck.performQuack();
    }

    @Test
    @DisplayName("測試模型鴨")
    public void modelDuckTest() {

        // arrange
        Duck modelDuck = new ModelDuck(new FlyNoWay(), new MuteQuack());

        // ack
        modelDuck.performFly();
        modelDuck.performQuack();
    }

    @Test
    @DisplayName("測試執行期間動態改變行為")
    public void runTimeChangedTest() {
        // arrange
        Duck modelDuck = new ModelDuck(new FlyNoWay(), new Squeak());

        modelDuck.setQuackBehavior(new MuteQuack());

        // ack
        modelDuck.performFly();
        modelDuck.performQuack();
    }
}
