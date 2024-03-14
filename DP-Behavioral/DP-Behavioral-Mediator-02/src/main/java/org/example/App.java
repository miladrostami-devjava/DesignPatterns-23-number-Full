package org.example;

import org.example.dp.AirTrafficControl;
import org.example.dp.AirTrafficControlImpl;
import org.example.dp.Airplane;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        AirTrafficControl airTrafficControl = new AirTrafficControlImpl();
        Airplane airplane1 = new Airplane("i545",airTrafficControl);
        Airplane airplane2 = new Airplane("k434",airTrafficControl);
        Airplane airplane3 = new Airplane("w232",airTrafficControl);
airTrafficControl.register(airplane1);
airTrafficControl.register(airplane2);
airTrafficControl.register(airplane3);
airplane1.sendMessage("hello i545");
airplane2.sendMessage("hello k434");
airplane3.sendMessage("hello w232");
    }
}
