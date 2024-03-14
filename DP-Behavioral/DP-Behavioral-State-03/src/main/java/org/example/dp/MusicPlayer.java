package org.example.dp;

import org.example.state.MusicPlayerState;
import org.example.state.StopState;

public class MusicPlayer {
    private MusicPlayerState currentState;

    public MusicPlayer() {
        currentState = new StopState();
    }
    public void changeState(MusicPlayerState state){
        currentState = state;
    }
    public void play(){
        currentState.display();
    }
    public void pause(){
        currentState.pause();
    }
    public void stop(){
        currentState.stop();
    }


}
