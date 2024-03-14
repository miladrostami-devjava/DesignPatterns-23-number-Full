package org.example;

import org.example.interfaces.VPN;

public class RealVPN implements VPN {
    private final String serverAddress;

    public RealVPN(String serverAddress) {
        this.serverAddress = serverAddress;
        System.out.println("Real VPN Connect Initialized ");
    }


    @Override
    public void connect() {
        System.out.println("connecting to vpn server at " + serverAddress);
        //todo: connecting actual vpn server
        System.out.println("Real VPN Connected!!!");
    }
}
