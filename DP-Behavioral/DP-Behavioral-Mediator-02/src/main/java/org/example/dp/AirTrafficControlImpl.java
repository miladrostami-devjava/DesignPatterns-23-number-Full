package org.example.dp;

import java.util.ArrayList;
import java.util.List;

public class AirTrafficControlImpl implements AirTrafficControl{
List<Airplane> airplanes = new ArrayList<>();



    @Override
    public void register(Airplane airplane) {
airplanes.add(airplane);
    }

    @Override
    public void sendMessage(Airplane sender, String message) {
        for (Airplane airplane: airplanes) {
            if (airplane != sender){
                airplane.receivedMessage(message);

            }
        }
    }
}
