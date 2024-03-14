package org.example.dp;

public class UserSubscriber implements Subscriber{
    private final String username;

    public UserSubscriber(String username) {
        this.username = username;
    }

    @Override
    public void update(String channel, String video) {
        System.out.println("subscriber " + " " + username + " " +
                "received a notification:" + " " +
                "new video " + " " + video + " "
        + "'uploaded on channel '" + " '" + channel + "' ");
    }
}
