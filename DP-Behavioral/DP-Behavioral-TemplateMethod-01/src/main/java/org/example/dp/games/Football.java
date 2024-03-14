package org.example.dp.games;

import org.example.dp.Game;

public class Football extends Game {
    @Override
    protected void initialize() {
        System.out.println("football is initialize");
    }

    @Override
    protected void startPlay() {
        System.out.println("football started ! enjoy");
    }

    @Override
    protected void endPlay() {
        System.out.println("football ended ! ");
    }
}
