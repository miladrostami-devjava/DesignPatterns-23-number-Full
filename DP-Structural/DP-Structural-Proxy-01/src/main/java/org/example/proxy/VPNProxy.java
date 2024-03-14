package org.example.proxy;

import org.example.RealVPN;
import org.example.interfaces.VPN;

public class VPNProxy implements VPN{
private final String serverAddress;
private VPN vpn;


    public VPNProxy(String serverAddress) {
        this.serverAddress = serverAddress;
        System.out.println("Virtual private Network (vpn) Proxy initialized!");
    }


    @Override
    public void connect() {
if (vpn == null){
    vpn = new RealVPN(serverAddress);
}
vpn.connect();
    }
}
