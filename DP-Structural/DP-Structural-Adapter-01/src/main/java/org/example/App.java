package org.example;

import org.example.charge.Charger;
import org.example.ligthing.LightningCharger;
import org.example.ligthing.LightningChargerAdapter;
import org.example.micro.MicroChargerAdapter;
import org.example.micro.MicroUSBCharger;
import org.example.usbc.USBCCharger;
import org.example.usbc.USBCChargerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
/*        USBCCharger usbcCharger = new USBCCharger();
        USBCChargerAdapter usbcChargerAdapter = new USBCChargerAdapter(usbcCharger);
        usbcChargerAdapter.charger();
        LightningCharger lightningCharger = new LightningCharger();
        LightningChargerAdapter lightningChargerAdapter = new LightningChargerAdapter(lightningCharger);
        lightningChargerAdapter.charger();
        MicroUSBCharger microUSBCharger = new MicroUSBCharger();
        MicroChargerAdapter microChargerAdapter = new MicroChargerAdapter(microUSBCharger);
        microChargerAdapter.charger();*/
        List<Charger> chargerList = new ArrayList<>();
        chargerList.add(new USBCChargerAdapter(new USBCCharger()));
        chargerList.add(new MicroChargerAdapter(new MicroUSBCharger()));
        chargerList.add(new LightningChargerAdapter(new LightningCharger()));

//        chargerList.forEach(x-> x.charger() );
        chargerList.forEach(Charger::charger);

    }
}
