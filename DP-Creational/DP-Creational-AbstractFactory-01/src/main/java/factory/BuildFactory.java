package factory;

import models.AndroidApp;
import models.IOSApp;
import models.MobileApp;

public interface BuildFactory {
    public MobileApp builderApp(String name,double version);



}
