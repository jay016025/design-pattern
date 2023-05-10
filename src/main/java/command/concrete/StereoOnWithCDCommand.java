package command.concrete;

import command.Command;
import command.receive.Stereo;

public class StereoOnWithCDCommand implements Command {

    private final Stereo stereo;

    public StereoOnWithCDCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.on();
        stereo.setCD();
        stereo.setVolume(11); // 音量
    }

    @Override
    public void undo() {

    }
}
