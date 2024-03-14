package org.example;

import factory.FactoryPhone;
import models.Phone;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        FactoryPhone factoryPhone = new FactoryPhone();
        Phone iPhone15 = factoryPhone.createPhone("IPHONE");
        Phone samsung15 = factoryPhone.createPhone("samsung");
        iPhone15.manufacture();
        samsung15.manufacture();



   }
}
