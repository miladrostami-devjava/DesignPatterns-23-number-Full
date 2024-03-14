package org.example.developer;

import org.example.employee.Employee;

public class Developer implements Employee {
    private String name;
    private String position;

    public Developer(String name, String position) {
        this.name = name;
        this.position = position;
    }

    @Override
    public void displayDetail() {
        System.out.println("Developer : [Name = "+ name +"],[Position = "+position+"]");
    }
}
