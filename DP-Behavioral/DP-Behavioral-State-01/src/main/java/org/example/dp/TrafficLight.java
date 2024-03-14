package org.example.dp;

public class TrafficLight {
    private TrafficLightInterface currentState;

    public TrafficLight() {
        this.currentState = new RedLight();
    }
    public void changeState(TrafficLightInterface state){
        currentState = state;

    }
    public void displayCurrentState(){
        currentState.display();
    }
}
