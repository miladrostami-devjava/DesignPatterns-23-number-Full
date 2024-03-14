package org.example.rentCar;

import java.util.HashSet;
import java.util.Set;

public class CarRentSystem {
    private final Set<String> availableCars;
    private final Set<String> rentedCars;

    public CarRentSystem() {
        availableCars = new HashSet<>();
        rentedCars = new HashSet<>();
        prepareCars();

    }
    private void prepareCars() {
        availableCars.add("BMW X5");
        availableCars.add("BMW X4");
        availableCars.add("BMW X6");
        availableCars.add("BMW X8");

    }

    public void rentCar(String car){
if (availableCars.contains(car)){
    availableCars.remove(car);
    rentedCars.add(car);
}else {
    System.out.println(car + " " + "is not available for rent!");
}
    }

    public void returnCars(String car){
        if (rentedCars.contains(car)){
            rentedCars.remove(car);
            availableCars.add(car);
        }else {
            System.out.println(car + " " + "was not rented from this System!");
        }
    }
public void showAllAvailableCars(){
    System.out.println("availableCars " + availableCars);
        availableCars.forEach(System.out::println);
}
    public void showAllRentedCars(){
        System.out.println("rentedCars" + rentedCars);
        rentedCars.forEach(System.out::println);
    }



}
