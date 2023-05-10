package command.concrete;

import command.Command;

/**
 * Null 物件，用於預設值
 * 用於不想讓客戶端處理沒有東西可用的情況下的預設值。
 */
public class NoCommand implements Command {

    @Override
    public void execute() {}

    @Override
    public void undo() {}
}
