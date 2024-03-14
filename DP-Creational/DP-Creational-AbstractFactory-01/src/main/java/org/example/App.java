package org.example;

import factory.BuildFactory;
import imlfactory.AndroidAppFactory;
import imlfactory.BlackBerryAppFactory;
import imlfactory.IOSAppFactory;
import models.MobileApp;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

    //    BuildFactory buildFactory = new BuildFactory();
        MobileApp androidApp = new AndroidAppFactory()
                .builderApp("android",1.0);
        androidApp.buildApp();
        MobileApp iosApp = new  IOSAppFactory()
                .builderApp("ios",2.0);
        iosApp.buildApp();
        MobileApp blackBerryApp = new BlackBerryAppFactory()
                .builderApp("blackBerry",3.0);
        blackBerryApp.buildApp();
//        AndroidApp androidApp = new AndroidApp("myAppAndroid",1.0);
//        androidApp.buildApp();
//        IOSApp iosApp = new IOSApp("myIOSApp",2.0);
//        iosApp.buildApp();

    }
}
