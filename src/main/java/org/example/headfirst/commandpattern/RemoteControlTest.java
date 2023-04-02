package org.example.headfirst.commandpattern;

import org.example.headfirst.commandpattern.command.*;

public class RemoteControlTest {
    public static void main(String[] args) {
        // Create remote
        RemoteControl remoteControl = new RemoteControl();

        // Create devices
        Light livingRoomLight = new Light("Living room");
        Light kitchenLight = new Light("Kitchen");
        GarageDoor garageDoor = new GarageDoor("Garage");
        Stereo livingRoomStereo = new Stereo("Living room");

        remoteControl.setCommand(1, livingRoomLight::on, livingRoomLight::off);
        remoteControl.setCommand(2, kitchenLight::on, kitchenLight::off);
        remoteControl.setCommand(3, garageDoor::up, garageDoor::down);
        remoteControl.setCommand(4, () -> {
            livingRoomStereo.on();
            livingRoomStereo.setVolume(11);
            livingRoomStereo.setCd();
                }
                , livingRoomStereo::off);

        remoteControl.onButtonWasPressed(1);
        remoteControl.offButtonWasPressed(1);
        remoteControl.onButtonWasPressed(2);
        remoteControl.offButtonWasPressed(2);
        remoteControl.onButtonWasPressed(3);
        remoteControl.offButtonWasPressed(3);
        remoteControl.onButtonWasPressed(4);
        remoteControl.offButtonWasPressed(4);
        remoteControl.onButtonWasPressed(5);
    }
}
