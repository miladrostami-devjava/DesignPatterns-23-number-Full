package org.example.vehicle;

import org.example.nav.NavigationSystems;

public abstract class Vehicle {
    public final NavigationSystems navigationSystems;

    public Vehicle(NavigationSystems navigationSystems) {
        this.navigationSystems = navigationSystems;
    }

   public abstract void drive();

}
