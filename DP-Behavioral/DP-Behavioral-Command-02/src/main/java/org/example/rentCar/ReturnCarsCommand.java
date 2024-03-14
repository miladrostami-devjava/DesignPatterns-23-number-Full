package org.example.rentCar;

import org.example.carCommand.CarCommand;

public class ReturnCarsCommand implements CarCommand {
    private final CarRentSystem system;
    private final String car;

    public ReturnCarsCommand(CarRentSystem system, String car) {
        this.system = system;
        this.car = car;
    }


    @Override
    public void execute() {
        system.returnCars(car);
    }

    


}
