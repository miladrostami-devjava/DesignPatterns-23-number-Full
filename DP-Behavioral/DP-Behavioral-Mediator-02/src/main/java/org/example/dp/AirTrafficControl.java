package org.example.dp;

public interface AirTrafficControl {
    void register(Airplane airplane);
    void sendMessage(Airplane sender,String message);

}
