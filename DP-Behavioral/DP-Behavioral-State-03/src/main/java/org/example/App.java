package org.example;

import org.example.dp.MusicPlayer;
import org.example.state.DisplayState;
import org.example.state.PauseState;
import org.example.state.StopState;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        MusicPlayer musicPlayer = new MusicPlayer();
        musicPlayer.play();
        musicPlayer.changeState(new DisplayState());
        musicPlayer.pause();
        musicPlayer.changeState(new PauseState());
        musicPlayer.stop();
        musicPlayer.changeState(new StopState());



    }
}
