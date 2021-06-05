package com.sda.ex1;

/**Exercise 1.Create a method
// that takes a string list as a parameter,
// then returns  the list sorted alphabetically from Z to A
*/

import java.text.Collator;
import java.util.*;
import java.util.stream.Collectors;

public class Ex1Main {

    public static void main(String[] args) {

        List<String> nameList = new ArrayList<>();
        nameList.add("Georgel");
        nameList.add("ionel");
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
                sorted(Comparator.comparing(String::toString).reversed())
                .collect(Collectors.toList());


    }
}
