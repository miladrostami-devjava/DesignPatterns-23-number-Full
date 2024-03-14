package org.example.dp;

public class Airplane {
    private String name;
private AirTrafficControl mediator;
    public Airplane(String name, AirTrafficControl mediator) {
        this.name = name;
        this.mediator = mediator;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
public void sendMessage(String message){
    System.out.println(name + "send message : " + message);
    mediator.sendMessage(this,message);
}
    public void receivedMessage(String message) {
        System.out.println(name + " receive message :" + message);
    }
}
