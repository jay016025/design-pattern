package command.concrete;

import command.Command;
import command.receive.Light;

/**
 * 命令物件實作 開燈命令
 */
public class LightOnCommand implements Command {

    // 實際作動的物件
    private final Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }


    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }
}
