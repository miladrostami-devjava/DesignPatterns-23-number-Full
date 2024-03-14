package org.example.dp.games;

import org.example.dp.Game;

public class Volleyball extends Game {
    @Override
    protected void initialize() {
        System.out.println("volleyball is initialize");
    }

    @Override
    protected void startPlay() {
        System.out.println("volleyball started ! enjoy");
    }

    @Override
    protected void endPlay() {
        System.out.println("volleyball ended ! ");
    }
}
