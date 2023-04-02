package org.example.headfirst.commandpattern.command;

import org.example.headfirst.commandpattern.Light;
import org.example.headfirst.commandpattern.command.Command;

public class LightOffCommand implements Command {
    private Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }
}
