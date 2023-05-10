package command;

import command.concrete.*;
import command.receive.Hottub;
import command.receive.Light;
import command.receive.Stereo;
import command.receive.TV;
import org.junit.jupiter.api.Test;

public class TestCommand {

    @Test
    public void testRemoteControl() {

        // arrange
        RemoteControl remoteControl = new RemoteControl();

        Light roomLight = new Light("Room");
        Stereo stereo = new Stereo("Room");

        LightOnCommand lightOnCommand = new LightOnCommand(roomLight);
        LightOffCommand lightOffCommand = new LightOffCommand(roomLight);
        StereoOnWithCDCommand stereoOnWithCDCommand = new StereoOnWithCDCommand(stereo);
        StereoOffCommand stereoOffCommand = new StereoOffCommand(stereo);

        // ack
        remoteControl.setCommand(0, lightOnCommand, lightOffCommand);
        remoteControl.setCommand(1, stereoOnWithCDCommand, stereoOffCommand);
        remoteControl.pushOn(0);
        remoteControl.pushOn(1);
        remoteControl.pushOff(0);
        remoteControl.pushOff(1);

    }

    @Test
    public void testRemoteControlWithUndo() {
        RemoteControl remoteControl = new RemoteControl();

        Light roomLight = new Light("room");
        LightOnCommand lightOnCommand = new LightOnCommand(roomLight);
        LightOffCommand lightOffCommand = new LightOffCommand(roomLight);

        remoteControl.setCommand(0, lightOnCommand, lightOffCommand);

        remoteControl.pushOn(0);
        remoteControl.pushOff(0);
        remoteControl.pushUndo();
    }

    @Test
    public void testMacroCommand() {

        // arrange
        Light light = new Light("room");
        TV tv = new TV("room");
        Stereo stereo = new Stereo("room");
        Hottub hottub = new Hottub();

        LightOnCommand lightOn = new LightOnCommand(light);
        StereoOnWithCDCommand stereoOn = new StereoOnWithCDCommand(stereo);
        TVOnCommand tvOn = new TVOnCommand(tv);
        HottubOnCommand hottubOn = new HottubOnCommand(hottub);

        LightOffCommand lightOff = new LightOffCommand(light);
        StereoOffCommand stereoOff = new StereoOffCommand(stereo);
        TVOffCommand tvOff = new TVOffCommand(tv);
        HottubOffCommand hottubOff = new HottubOffCommand(hottub);

        Command[] partyOn = {lightOn, stereoOn, tvOn, hottubOn};
        Command[] partyOff = {lightOff, stereoOff, tvOff, hottubOff};

        MacroCommand partyOnMacro = new MacroCommand(partyOn);
        MacroCommand partyOffMacro = new MacroCommand(partyOff);

        // ack
        RemoteControl remoteControl = new RemoteControl();
        remoteControl.setCommand(0, partyOnMacro, partyOffMacro);

        remoteControl.pushOn(0);
        remoteControl.pushOff(0);
    }

}
