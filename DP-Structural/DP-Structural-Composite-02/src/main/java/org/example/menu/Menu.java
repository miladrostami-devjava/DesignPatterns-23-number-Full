package org.example.menu;

import java.util.ArrayList;
import java.util.List;

public class Menu implements MenuComponent {
    private String name;
    private List<MenuComponent> subMenu = new ArrayList<>();

    public Menu(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addSubMenu(MenuComponent menu) {
        subMenu.add(menu);
    }

    public void removeSubMenu(MenuComponent menu) {
        subMenu.remove(menu);
    }

    @Override
    public void display() {
        System.out.println("Menu :" + name);
        System.out.println("SubMenu :" + name);
        subMenu.forEach(MenuComponent::display);
    }
}
