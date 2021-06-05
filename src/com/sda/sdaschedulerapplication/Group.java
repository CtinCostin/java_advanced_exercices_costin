package com.sda.sdaschedulerapplication;

import java.util.List;

public class Group {

    String name;
    Trainer trainer;
    List<Student> studentList;

    public Group(String name, Trainer trainer, List<Student> studentList) {
        this.name = name;
        this.trainer = trainer;
        this.studentList = studentList;
    }

    @Override
    public String toString() {
        return "Group{" +
                "name='" + name + '\'' +
                ", trainer=" + trainer +
                ", studentList=" + studentList +
                '}';
    }
}
