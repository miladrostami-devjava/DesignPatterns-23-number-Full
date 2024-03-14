package org.example.light;

import org.example.command.Command;

public class TurnOffLightCommand implements Command {
    private final Light light;

    public TurnOffLightCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
    light.turnOffLight();
    }
}
