package org.example.state;

public class StopState implements MusicPlayerState{
    @Override
    public void display() {
        System.out.println("already display");
    }
    @Override
    public void pause() {
        System.out.println("please display the music!!");
    }
    @Override
    public void stop() {
        System.out.println("stoped");

    }
}
