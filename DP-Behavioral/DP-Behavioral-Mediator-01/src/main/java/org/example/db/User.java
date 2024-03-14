package org.example.db;

public class User {
    private String username;
private ChatMediator mediator;
    public User(String username, ChatMediator mediator) {
        this.username = username;
        this.mediator = mediator;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
public void sendMessage(String message){
    System.out.println(username + "send message " + message);
        mediator.sendMessage(message,this);
}
    public void receiveMessage(String message) {
        System.out.println(username + " received messaged " + message);
    }
}
