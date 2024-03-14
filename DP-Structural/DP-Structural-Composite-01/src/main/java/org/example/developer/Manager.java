package org.example.developer;

import org.example.employee.Employee;

import java.util.ArrayList;
import java.util.List;

public class Manager implements Employee {
    private String name;
    private String position;
    private List<Employee> subordinates = new ArrayList<>();


    public Manager(String name, String position) {
        this.name = name;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
public void hireEmployee(Employee employee){
        subordinates.add(employee);
}
public void fireEmployee(Employee employee){
        subordinates.remove(employee);
}

    @Override
    public void displayDetail() {
        System.out.println("Manager :  [Name = "+ name +"],[Position = "+position+"]");
        System.out.println("Subordinates :");
        subordinates.forEach(Employee::displayDetail);
    }
}
