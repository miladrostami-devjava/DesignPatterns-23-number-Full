package imlfactory;

import factory.BuildFactory;
import models.AndroidApp;
import models.IOSApp;
import models.MobileApp;

public class IOSAppFactory implements BuildFactory {
    @Override
    public MobileApp builderApp(String name, double version) {
        return new IOSApp(name, version);
    }
}
