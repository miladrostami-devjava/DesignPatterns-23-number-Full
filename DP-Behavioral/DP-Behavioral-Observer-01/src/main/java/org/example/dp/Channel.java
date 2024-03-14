package org.example.dp;

public interface Channel {

    void subscribe(Subscriber subscriber);
    void unsubscribe(Subscriber subscriber);
    void notifySubscribes(String video);

}
