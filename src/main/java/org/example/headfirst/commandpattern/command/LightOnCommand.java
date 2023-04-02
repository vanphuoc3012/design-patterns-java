package org.example.headfirst.commandpattern.command;

import org.example.headfirst.commandpattern.Light;
import org.example.headfirst.commandpattern.command.Command;

public class LightOnCommand implements Command {
    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
}
