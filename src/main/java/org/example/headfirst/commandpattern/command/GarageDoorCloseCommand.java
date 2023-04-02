package org.example.headfirst.commandpattern.command;

import org.example.headfirst.commandpattern.GarageDoor;

public class GarageDoorCloseCommand implements Command{
    private GarageDoor garageDoor;

    public GarageDoorCloseCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.down();
    }

}
