package org.example;

import org.example.menu.Menu;
import org.example.menu.MenuComponent;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Menu mainMenu = new Menu("main menu");
        mainMenu.addSubMenu(new Menu("item1"));
        mainMenu.addSubMenu(new Menu("item2"));
        mainMenu.addSubMenu(new Menu("item3"));

        Menu subMenu = new Menu("subMenu");
        subMenu.addSubMenu(new Menu("sub1"));
        subMenu.addSubMenu(new Menu("sub2"));
        subMenu.addSubMenu(new Menu("sub3"));
        subMenu.addSubMenu(new Menu("sub4"));

        mainMenu.display();


    }
}
