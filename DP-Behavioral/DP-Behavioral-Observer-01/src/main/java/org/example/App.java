package org.example;

import org.example.dp.Channel;
import org.example.dp.Subscriber;
import org.example.dp.UserSubscriber;
import org.example.dp.YoutubeChannel;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Channel channel = new YoutubeChannel("spring.io");
        Subscriber subscriber1 = new UserSubscriber("ali");
        Subscriber subscriber2 = new UserSubscriber("mohammad");
        Subscriber subscriber3 = new UserSubscriber("milad");
        channel.subscribe(subscriber1);
        channel.subscribe(subscriber2);
        channel.subscribe(subscriber3);

        String newVideo = "observer design pattern is behavioral design pattern";
        channel.notifySubscribes(newVideo);

    }
}
