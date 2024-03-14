package org.example.fan;

import org.example.command.Command;

public class IncreaseSpeedFanCommand implements Command {
    private final Fan fan;

    public IncreaseSpeedFanCommand(Fan fan) {
        this.fan = fan;
    }


    @Override
    public void execute() {
       fan.increaseSpeed();
    }
}
