package org.example;

import org.example.db.ChatMediator;
import org.example.db.ChatMediatorImpl;
import org.example.db.User;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ChatMediator chatMediator = new ChatMediatorImpl();
        User user1 = new User("milad",chatMediator);
        User user2 = new User("ali",chatMediator);
        User user3 = new User("hoda",chatMediator);
        User user4 = new User("jack",chatMediator);
        chatMediator.joinToChat(user1);
        chatMediator.joinToChat(user2);
        chatMediator.joinToChat(user3);
        chatMediator.joinToChat(user4);
user1.sendMessage("hello java");
user2.sendMessage("hello!");
user3.sendMessage("what?");
user4.sendMessage("ok");
user1.receiveMessage("ok ? what...");

    }
}
