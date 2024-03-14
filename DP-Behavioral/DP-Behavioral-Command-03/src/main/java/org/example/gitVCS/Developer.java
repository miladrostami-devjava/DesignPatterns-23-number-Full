package org.example.gitVCS;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Developer {

    private final Stack<Command> commandHistory = new Stack<>();
    public void executeCommands(Command command){
        command.execute();
        commandHistory.add(command);
    }
public void undoLastCommand(){
        if (commandHistory.isEmpty()){
            System.out.println("No commands to Undo!");
        }
        Command lastCommand = commandHistory.pop();
        lastCommand.undo();

}

}
