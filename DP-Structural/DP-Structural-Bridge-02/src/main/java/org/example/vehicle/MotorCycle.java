package org.example.vehicle;

import org.example.nav.NavigationSystems;

public class MotorCycle extends Vehicle{
    public MotorCycle(NavigationSystems navigationSystems) {
        super(navigationSystems);
    }

    @Override
 public    void drive() {
        System.out.println("Driving with MotorCycle");
        navigationSystems.navigate();
    }
}
