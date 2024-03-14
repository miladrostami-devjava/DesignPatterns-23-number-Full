package org.example.remote;

import org.example.carCommand.CarCommand;

import java.util.LinkedList;
import java.util.Queue;

public class CustomerRemote {
    private Queue<CarCommand> commands;

    public CustomerRemote() {
        commands = new LinkedList<>();

    }

    public void rentCar(CarCommand carCommand){
        commands.add(carCommand);
    }
    public void returnCar(CarCommand carCommand){
        commands.add(carCommand);
    }
public void processCommands(){
        while (!commands.isEmpty()){
            CarCommand carCommand = commands.poll();
            carCommand.execute();
        }

}



}
