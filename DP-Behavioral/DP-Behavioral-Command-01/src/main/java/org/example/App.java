package org.example;

import org.example.fan.*;
import org.example.light.Light;
import org.example.light.TurnOffLightCommand;
import org.example.light.TurnOnLightCommand;
import org.example.remote.RemoteControl;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Fan ceilingFan = new Fan();
        Light roomLight = new Light();
        RemoteControl remoteOne = new RemoteControl();
// step command example:
        //turn on room light
        // start
        // inc
        // inc
        // inc
        // dec
        // dec
        // dec
        // stop
//turn off room light
        remoteOne.setCommand(new TurnOnLightCommand(roomLight));
        remoteOne.pressButton();
        remoteOne.setCommand(new StartFanCommand(ceilingFan));
        remoteOne.pressButton();
        remoteOne.setCommand(new IncreaseSpeedFanCommand(ceilingFan));
        remoteOne.pressButton();
        remoteOne.setCommand(new IncreaseSpeedFanCommand(ceilingFan));
        remoteOne.pressButton();
        remoteOne.setCommand(new IncreaseSpeedFanCommand(ceilingFan));
        remoteOne.pressButton();
        remoteOne.setCommand(new DecreaseSpeedFanCommand(ceilingFan));
        remoteOne.pressButton();
        remoteOne.setCommand(new DecreaseSpeedFanCommand(ceilingFan));
        remoteOne.pressButton();
        remoteOne.setCommand(new DecreaseSpeedFanCommand(ceilingFan));
        remoteOne.pressButton();
        remoteOne.setCommand(new StopFanCommand(ceilingFan));
        remoteOne.pressButton();
        remoteOne.setCommand(new TurnOffLightCommand(roomLight));
        remoteOne.pressButton();
    }
}
