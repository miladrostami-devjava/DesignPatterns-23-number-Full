package org.example.usbc;

import org.example.charge.Charger;

public class USBCChargerAdapter implements Charger {
    private final USBCCharger usbcCharger;


    public USBCChargerAdapter(USBCCharger usbcCharger) {
        this.usbcCharger = usbcCharger;
    }

    @Override
    public void charger() {
        usbcCharger.usbCCharge();
    }
}
