package com.sda.sdaschedulerapplication;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class SDASchedulerApplicationMain {

    public static void main(String[] args) {

        Student student1 = new Student("Constantin", "Georgescu", "19/07/1979", false);
        Student student2 = new Student("Ion", "Vasile", "10/05/1999", false);
        Student student3 = new Student("Rares", "Georgescu", "01/01/2005", false);
        Student student4 = new Student("Mihai", "Aldea", "02/12/2000", true);
        Student student5 = new Student("Camelia", "Ivan", "28/04/1976", false);
        Student student6 = new Student("Ioana", "Dumitrache", "09/08/1955", false);
        Student student7 = new Student("Catalin", "Hornet", "11/02/1980", false);
        Student student8 = new Student("Dorian", "Popa", "17/09/1985", false);
        Student student9 = new Student("Cristi", "Dumitru", "22/03/1990", true);
        Student student10 = new Student("Bogdan", "Damaroiu", "07/06/1978", false);
        Student student11 = new Student("Elena", "Chirca", "25/04/1969", false);
        Student student12 = new Student("Carmen", "Dumitrescu", "25/12/1977", true);
        Student student13 = new Student("Ciprian", "Cucu", "21/11/1978", false);
        Student student14 = new Student("Alina", "Draghia", "15/09/1980", true);
        Student student15 = new Student("Alexandra", "Anton", "18/01/1997", true);

        List<Student> studentList = new ArrayList<>();
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);
        studentList.add(student5);
        studentList.add(student6);
        studentList.add(student7);
        studentList.add(student8);
        studentList.add(student9);
        studentList.add(student10);
        studentList.add(student11);
        studentList.add(student12);
        studentList.add(student13);
        studentList.add(student14);
        studentList.add(student15);

        for (int i = 0; i < studentList.size(); i++) {
            System.out.println(studentList.get(i));

        }



        System.out.println("\n----------------------------------------\n");

        Trainer trainer1 = new Trainer("Catalin", "Halic", "15/05/1997", true);
        Trainer trainer2 = new Trainer("Alina", "Noge", "22/08/1985", true);
        Trainer trainer3 = new Trainer("Rares", "Petrescu", "07/03/1991", true);

        List<Trainer> trainerList = new ArrayList<>();
        trainerList.add(trainer1);
        trainerList.add(trainer2);
        trainerList.add(trainer3);

        for (int i = 0; i < trainerList.size(); i++) {
            System.out.println(trainerList.get(i));
        }

        System.out.println("\n------------------------------------------\n");


        Group group1 = new Group("JavaRo22", trainer1, studentList);
        Group group2 = new Group("JavaRO20", trainer3, studentList);
        Group group3 = new Group("PythonRo5", trainer2, studentList);
        Group group4 = new Group("TesterRo10", trainer1, studentList);

        List<Group> groupList = new ArrayList<>();
        groupList.add(group1);
        groupList.add(group2);
        groupList.add(group3);
        groupList.add(group4);

        for (int i = 0; i < groupList.size(); i++) {
            System.out.println(groupList.get(i));
        }

        System.out.println("\n---------------------------------------------\n");

        List<List<Student>> groups = new ArrayList<>();


        List<Student> groupList1 = new ArrayList<>();
        groupList1.add(student1);
        groupList1.add(student2);
        groupList1.add(student3);

        List<Student> groupList2 = new ArrayList<>();
        groupList2.add(student4);
        groupList2.add(student5);
        groupList2.add(student6);
        groupList2.add(student15);

        List<Student> groupList3 = new ArrayList<>();
        groupList3.add(student7);
        groupList3.add(student8);
        groupList3.add(student9);

        List<Student> groupList4 = new ArrayList<>();
        groupList4.add(student10);
        groupList4.add(student11);
        groupList4.add(student12);
        groupList4.add(student13);
        groupList4.add(student14);

        groups.add(groupList1);
        groups.add(groupList2);
        groups.add(groupList3);
        groups.add(groupList4);


        for (int i = 0; i < groups.size(); i++) {
            List<Student> students = groups.get(i);


            for (int j = 0; j < students.size(); j++) {
                Student student = students.get(j);

                System.out.println(student);
            }
            System.out.println("-------------------------");
        }
    }

}