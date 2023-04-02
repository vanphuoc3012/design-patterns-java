package org.example.headfirst.commandpattern.command;

import org.example.headfirst.commandpattern.GarageDoor;

public class GarageDoorOpenCommand implements Command{
    private GarageDoor garageDoor;

    public GarageDoorOpenCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.up();
    }

}
