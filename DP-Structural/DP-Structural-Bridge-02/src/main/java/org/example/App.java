package org.example;

import org.example.nav.AppleMap;
import org.example.nav.GoogleMap;
import org.example.nav.NavigationSystems;
import org.example.vehicle.Car;
import org.example.vehicle.MotorCycle;
import org.example.vehicle.Vehicle;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        NavigationSystems googleMap = new GoogleMap();
        Vehicle car = new Car(googleMap);
        car.drive();
        NavigationSystems appleMap = new AppleMap();
        Vehicle motorCycle = new MotorCycle(appleMap);
        motorCycle.drive();
    }
}
