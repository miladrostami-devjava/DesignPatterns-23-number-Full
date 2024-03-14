package org.example;

import org.example.developer.Developer;
import org.example.developer.Manager;
import org.example.employee.Employee;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Employee dev1 = new Developer("milad", "senior Back_end developer");
        Employee dev2 = new Developer("armin", "senior Front_end developer");
        Employee dev3 = new Developer("ali", "junior Back_end developer");
        Employee dev4 = new Developer("ahmad", "junior Front_end developer");

        Manager cto = new Manager("reza", "CTO ");
        Manager techLead = new Manager("kamran", "technical Lead");

        cto.hireEmployee(techLead);
        techLead.hireEmployee(dev1);
        techLead.hireEmployee(dev2);
        techLead.hireEmployee(dev3);
        techLead.hireEmployee(dev4);

        cto.displayDetail();


    }
}
