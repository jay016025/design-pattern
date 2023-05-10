package command.concrete;

import command.Command;
import command.receive.Hottub;

public class HottubOffCommand implements Command {
	Hottub hottub;

	public HottubOffCommand(Hottub hottub) {
		this.hottub = hottub;
	}

	public void execute() {
		hottub.cool();
		hottub.off();
	}

	@Override
	public void undo() {

	}
}
