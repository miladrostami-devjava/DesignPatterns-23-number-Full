package org.example.fan;

import org.example.command.Command;

public class DecreaseSpeedFanCommand implements Command {
    private final Fan fan;

    public DecreaseSpeedFanCommand(Fan fan) {
        this.fan = fan;
    }


    @Override
    public void execute() {
       fan.decreaseSpeed();
    }
}
