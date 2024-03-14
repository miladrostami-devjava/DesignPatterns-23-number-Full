package org.example.dp;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class YoutubeChannel implements Channel {

    private final String channelName;
    private Set<Subscriber> subscribers = new HashSet<>();

    public YoutubeChannel(String channelName) {
        this.channelName = channelName;
    }

    @Override
    public void subscribe(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    @Override
    public void unsubscribe(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    @Override
    public void notifySubscribes(String video) {
        for (Subscriber subscriber: subscribers) {
            subscriber.update(channelName,video);
        }
    }


}
