package org.example.headfirst.commandpattern;

import org.example.headfirst.commandpattern.command.Command;
import org.example.headfirst.commandpattern.command.NoCommand;

import java.util.Arrays;

public class RemoteControl {
    private Command[] onCommand;
    private Command[] offCommand;

    public RemoteControl() {
        this.onCommand = new Command[7];
        this.offCommand = new Command[7];
        Command noCommand = new NoCommand();
        Arrays.fill(onCommand, noCommand);
        Arrays.fill(offCommand, noCommand);
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        if (slot > 7 || slot < 1) throw new IllegalArgumentException("Invalid slot, slot range from 1 - 7");
        this.onCommand[slot - 1] = onCommand;
        this.offCommand[slot - 1] = offCommand;
    }

    public void onButtonWasPressed(int slot) {
        this.onCommand[slot - 1].execute();
    }

    public void offButtonWasPressed(int slot) {
        this.offCommand[slot - 1].execute();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n------ Remote Control -------\n");
        for (int i = 0; i < onCommand.length; i++) {
            sb.append("[slot "+(i+1)+"] " + onCommand[i].getClass().getName()
            + "     " + offCommand[i].getClass().getName() + "\n");
        }
        return sb.toString();
    }
}
