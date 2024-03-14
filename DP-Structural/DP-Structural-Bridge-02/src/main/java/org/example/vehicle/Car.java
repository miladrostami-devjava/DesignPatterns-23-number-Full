package org.example.vehicle;

import org.example.nav.NavigationSystems;

public class Car extends Vehicle{
    public Car(NavigationSystems navigationSystems) {
        super(navigationSystems);
    }

    @Override
   public void drive() {
        System.out.println("Driving with Car");
        navigationSystems.navigate();
    }
}
