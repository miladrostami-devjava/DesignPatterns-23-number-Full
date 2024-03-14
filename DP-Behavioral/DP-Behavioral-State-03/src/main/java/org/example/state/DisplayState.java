package org.example.state;

public class DisplayState implements MusicPlayerState{
    @Override
    public void display() {
        System.out.println("already display");
    }

    @Override
    public void pause() {
        System.out.println("");
        System.out.println("paused");
    }

    @Override
    public void stop() {
        System.out.println("");
        System.out.println("stopped");
    }
}
