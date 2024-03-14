package org.example;

import org.example.dp.GreenLight;
import org.example.dp.TrafficLight;
import org.example.dp.YellowLight;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        TrafficLight trafficLight = new TrafficLight();
        trafficLight.displayCurrentState();

        trafficLight.changeState(new GreenLight());
        trafficLight.displayCurrentState();
        trafficLight.changeState(new YellowLight());
        trafficLight.displayCurrentState();

    }
}
