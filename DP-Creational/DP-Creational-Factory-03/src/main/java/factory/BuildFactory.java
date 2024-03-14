package factory;

import models.AndroidApp;
import models.IOSApp;
import models.MobileApp;

public class BuildFactory {
    public MobileApp builderApp(String type,String name,double version){
        if (type.equalsIgnoreCase("android")){
            return new AndroidApp(name, version);
        } else if (type.equalsIgnoreCase("ios")) {
            return new IOSApp(name, version);
        }else {
            throw new IllegalArgumentException("invalid App building!");
        }
    }



}
