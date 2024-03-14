package org.example;

import factory.BuildFactory;
import models.AndroidApp;
import models.IOSApp;
import models.MobileApp;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        BuildFactory buildFactory = new BuildFactory();
        MobileApp androidApp = buildFactory.builderApp("android","myAndroidApp",1.0);
        androidApp.buildApp();
        MobileApp iosApp = buildFactory.builderApp("ios","myIOSApp",2.0);
        iosApp.buildApp();
//        AndroidApp androidApp = new AndroidApp("myAppAndroid",1.0);
//        androidApp.buildApp();
//        IOSApp iosApp = new IOSApp("myIOSApp",2.0);
//        iosApp.buildApp();


    }
}
