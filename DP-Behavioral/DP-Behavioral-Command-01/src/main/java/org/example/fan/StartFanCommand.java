package org.example.fan;

import org.example.command.Command;

public class StartFanCommand implements Command {
    private final Fan fan;

    public StartFanCommand(Fan fan) {
        this.fan = fan;
    }


    @Override
    public void execute() {
       fan.start();
    }
}
