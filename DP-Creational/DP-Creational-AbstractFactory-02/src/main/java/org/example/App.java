package org.example;

import abstractFactory.GUIFactory;
import enumApp.EnumApplication;
import forms.MainForm;
import imlFactory.DarkGUIImpAbstractFactory;
import imlFactory.LightGUIImpAbstractFactory;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        EnumApplication theme = EnumApplication.Light;
        GUIFactory factory;
        if (theme.equals(EnumApplication.Light)){
    factory = new LightGUIImpAbstractFactory();
        }else {
            factory = new LightGUIImpAbstractFactory();
        }
        MainForm form = new MainForm(factory);
        form.createFactory();




    }
}
