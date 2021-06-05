package com.sda.sdaschedulerapplication;

import java.util.Date;

public class Student extends Person{

    boolean hasPreviousJavaKnowledge;

    public Student(String firstName, String lastName,String dateOfBirth,boolean hasPreviousJavaKnowledge) {
        super(firstName, lastName, dateOfBirth);
        this.hasPreviousJavaKnowledge = hasPreviousJavaKnowledge;
    }

    public boolean isHasPreviousJavaKnowledge() {
        return hasPreviousJavaKnowledge;
    }

    public void setHasPreviousJavaKnowledge(boolean hasPreviousJavaKnowledge) {
        this.hasPreviousJavaKnowledge = hasPreviousJavaKnowledge;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", hasPreviousJavaKnowledge=" + hasPreviousJavaKnowledge +
                '}';
    }
}
