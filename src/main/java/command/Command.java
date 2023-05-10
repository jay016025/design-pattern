package command;

/**
 * 命令模式 命令介面
 * @author Jay
 */
public interface Command {

    void execute();
    void undo();
}
