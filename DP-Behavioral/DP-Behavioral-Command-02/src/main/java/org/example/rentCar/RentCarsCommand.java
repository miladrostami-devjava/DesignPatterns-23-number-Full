package org.example.rentCar;

import org.example.carCommand.CarCommand;

public class RentCarsCommand implements CarCommand {
    private final CarRentSystem system;
    private final String car;

    public RentCarsCommand(CarRentSystem system, String car) {
        this.system = system;
        this.car = car;
    }


    @Override
    public void execute() {
        system.rentCar(car);
    }




}
