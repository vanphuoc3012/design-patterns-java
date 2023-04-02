package org.example.headfirst.commandpattern;

public class Stereo {
    private String location;
    private int volume;

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if(volume > 11 || volume < 1) throw new IllegalArgumentException("Volume range: 1 - 11");
        System.out.println(location + "stereo set volume to " + volume);
        this.volume = volume;
    }

    public Stereo(String location) {
        this.location = location;
    }

    public void on() {
        System.out.println(location + "stereo is on");
    }
    public void off() {
        System.out.println(location + "stereo is off");
    }

    public void setCd() {
        System.out.println(location + "stereo is set for CD input");
    }
    public void setDvd() {
        System.out.println(location + "stereo is set for DVD input");
    }

    public void setRadio() {
        System.out.println(location + "stereo is set for Radio");
    }
}
