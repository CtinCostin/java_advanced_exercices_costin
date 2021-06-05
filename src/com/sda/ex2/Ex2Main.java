package com.sda.ex2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

//  Createa method
//  that takes a string list as a parameter,
//  then returns that list sorted alphabetically
//  from Z to A case-insensitive
//
public class Ex2Main {

    public static void main(String[] args) {


        List<String> nameList = new ArrayList<>();
        nameList.add("Georgel");
        nameList.add("Ionel");
        nameList.add("gigel");

        sortNamesReverseAlphabetically(nameList);

        List<String> reversedOrderedNamesList = sortNamesReverseAlphabetically(nameList);

        System.out.println("Aici iese lista sortata invers alfabetic");
        reversedOrderedNamesList.stream().forEach((String name) -> System.out.println(name));

        System.out.println("\nLista initiala nu a fost modificata");
        nameList.stream().forEach((String name) -> System.out.println(name));
    }


    public static List<String> sortNamesReverseAlphabetically(List<String> names) {
        return names.stream().
                sorted(Comparator.comparing(String::toString,String.CASE_INSENSITIVE_ORDER).reversed())
                .collect(Collectors.toList());


    }
}