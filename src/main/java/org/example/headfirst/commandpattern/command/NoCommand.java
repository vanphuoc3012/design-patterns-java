package org.example.headfirst.commandpattern.command;

public class NoCommand implements Command{
    @Override
    public void execute() {
        System.out.println("No command");
    }
}
