package com.sda.sdaschedulerapplication;

import java.util.Date;

public class Trainer extends Person{

    boolean isAuthorized;

    public Trainer(String firstName, String lastName,String dateOfBirth,boolean isAuthorized) {
        super(firstName, lastName, dateOfBirth);
        this.isAuthorized = isAuthorized;
    }

    @Override
    public String toString() {
        return "Trainer{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", isAuthorized=" + isAuthorized +
                '}';
    }
}
