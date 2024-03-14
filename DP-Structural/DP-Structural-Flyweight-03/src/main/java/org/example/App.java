package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
Font arial1 = FontFactory.getFont("Arial");
Font arial2 = FontFactory.getFont("Arial");
        System.out.println("arial1=arial2" +" " + (arial1==arial2) );

        Font times1 = FontFactory.getFont("TimesNewRoman");
        Font times2 = FontFactory.getFont("TimesNewRoman");
        System.out.println("times1=times2" +" " + (times1==times2) );

        arial1.render("hello Arial font");
        times1.render("hello TimesNewRoman font");
    }
}
