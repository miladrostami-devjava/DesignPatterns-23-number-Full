package org.example.dp;

public class User implements Observer {
    private String username;

    public User(String username) {
        this.username = username;
    }

    @Override
    public void update(double temperature, double humidity) {
        System.out.println("User" + " " + username + "  "
                + " received a weather update "
                + " temperature" + " " + temperature + "  " +
                "humidity" + " " + humidity);

    }
}
