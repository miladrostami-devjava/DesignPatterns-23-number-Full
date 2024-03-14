package org.example.db;

import java.util.ArrayList;
import java.util.List;

public class ChatMediatorImpl implements ChatMediator{
private List<User> users = new ArrayList<>();



    @Override
    public void sendMessage(String message, User sender) {
        for (User user:users) {
            if (user != sender){
                user.receiveMessage(message);
            }
        }
    }

    @Override
    public void joinToChat(User user) {
users.add(user);
        System.out.println(user.getUsername() + " jointed to chat channel !");
    }
}
