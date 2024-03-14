package org.example;

import org.example.remote.CustomerRemote;
import org.example.rentCar.CarRentSystem;
import org.example.rentCar.RentCarsCommand;
import org.example.rentCar.ReturnCarsCommand;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        CarRentSystem system = new CarRentSystem();
        system.showAllAvailableCars();
        system.showAllRentedCars();
        CustomerRemote milad = new CustomerRemote();

        milad.rentCar(new RentCarsCommand(system,"BMW X4"));
        milad.rentCar(new RentCarsCommand(system,"BMW X5"));
        milad.returnCar(new ReturnCarsCommand(system,"BMW X8"));
        milad.processCommands();
        system.showAllAvailableCars();
        system.showAllRentedCars();

    }
}
