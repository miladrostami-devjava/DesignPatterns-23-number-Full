package org.example.dp.model;

import java.util.Date;

public class User {
    private String firstName;
    private String lastName;
    private String nationalCode;
    private Date birthDate;

    public User(String firstName, String lastName, String nationalCode, Date birthDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.nationalCode = nationalCode;
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", nationalCode='" + nationalCode + '\'' +
                ", birthDate=" + birthDate +
                '}';
    }
}
