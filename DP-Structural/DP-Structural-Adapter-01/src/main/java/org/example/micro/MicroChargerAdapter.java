package org.example.micro;

import org.example.charge.Charger;

public class MicroChargerAdapter implements Charger {
    private final MicroUSBCharger microUSBCharger;

    public MicroChargerAdapter(MicroUSBCharger microUSBCharger) {
        this.microUSBCharger = microUSBCharger;
    }

    @Override
    public void charger() {
        microUSBCharger.microCharge();
    }
}
