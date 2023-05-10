package command;

import command.concrete.NoCommand;

/**
 * 命令模式: 遙控器物件
 * 參考深入淺出設計模式
 */
public class RemoteControl {

    private Command[] onCommands;
    private Command[] offCommands;
    private Command undoCommand;

    public RemoteControl() {
        onCommands = new Command[7];
        offCommands = new Command[7];

        Command noCommand = new NoCommand();
        for (int i = 0; i < onCommands.length; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
        undoCommand = noCommand;
    }

    public void setCommand(int slot, Command on, Command off) {
        onCommands[slot] = on;
        offCommands[slot] = off;
    }

    public void pushOn(int slot) {
        onCommands[slot].execute();
        undoCommand = onCommands[slot];
    }

    public void pushOff(int slot) {
        offCommands[slot].execute();
        undoCommand = offCommands[slot];
    }

    public void pushUndo() {
        undoCommand.undo();
    }

    @Override
    public String toString() {
        StringBuffer stringBuff = new StringBuffer();
        stringBuff.append("\n------ Remote Control -------\n");
        for (int i = 0; i < onCommands.length; i++) {
            stringBuff.append("[slot " + i + "] " + onCommands[i].getClass().getName()
                    + "    " + offCommands[i].getClass().getName() + "\n");
        }
        stringBuff.append("[undo] " + undoCommand.getClass().getName() + "\n");
        return stringBuff.toString();
    }
}
