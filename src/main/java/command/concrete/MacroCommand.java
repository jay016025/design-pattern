package command.concrete;

import command.Command;

/**
 * 巨集命令，可以執行多個命令的命令
 */
public class MacroCommand implements Command {

    private Command[] commands;

    public MacroCommand(Command[] commands) {
        this.commands = commands;
    }

    @Override
    public void execute() {
        for (Command cmd : commands) {cmd.execute();}
    }

    @Override
    public void undo() {

    }
}
