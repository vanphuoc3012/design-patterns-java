package org.example.headfirst.commandpattern.command;

import org.example.headfirst.commandpattern.Stereo;

public class StereoOffCommand implements Command{
    private Stereo stereo;

    public StereoOffCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.off();
    }
}
