package org.example.db;

public interface ChatMediator {
    void sendMessage(String message,User user);
    void joinToChat(User user);



}
