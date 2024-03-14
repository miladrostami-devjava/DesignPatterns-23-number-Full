package org.example.ligthing;

import org.example.charge.Charger;

public class LightningChargerAdapter implements Charger {
private final LightningCharger lightningCharger;

    public LightningChargerAdapter(LightningCharger lightningCharger) {
        this.lightningCharger = lightningCharger;
    }


    @Override
    public void charger() {
        lightningCharger.lightCharge();
    }
}
