package imlfactory;

import factory.BuildFactory;
import models.AndroidApp;
import models.MobileApp;

public class AndroidAppFactory implements BuildFactory {
    @Override
    public MobileApp builderApp(String name, double version) {
        return new  AndroidApp(name, version);
    }
}
