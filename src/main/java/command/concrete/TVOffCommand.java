package command.concrete;

import command.Command;
import command.receive.TV;

public class TVOffCommand implements Command {

    private final TV tv;

    public TVOffCommand(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.off();
    }

    @Override
    public void undo() {

    }
}
