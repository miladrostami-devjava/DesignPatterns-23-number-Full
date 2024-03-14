package org.example;

import org.example.interfaces.VPN;
import org.example.proxy.VPNProxy;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        VPN vpn = new VPNProxy("127.0.2.12");
        vpn.connect();

    }
}
