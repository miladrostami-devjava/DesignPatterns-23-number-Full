package imlfactory;

import factory.BuildFactory;
import models.BlackBerryApp;
import models.MobileApp;

public class BlackBerryAppFactory implements BuildFactory {
    @Override
    public MobileApp builderApp(String name, double version) {
        return new BlackBerryApp(name, version);
    }
}
