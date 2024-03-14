package org.example.fan;

import org.example.command.Command;

public class StopFanCommand implements Command {
    private final Fan fan;

    public StopFanCommand(Fan fan) {
        this.fan = fan;
    }


    @Override
    public void execute() {
       fan.stop();
    }
}
