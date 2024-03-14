package org.example.dp;

public class GreenLight implements TrafficLightInterface {
    @Override
    public void display() {
        System.out.println("Green Light : Go!");
    }
}
