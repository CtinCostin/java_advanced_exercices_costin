package com.sda.ex3;

import java.util.HashMap;
import java.util.Map;

public class Ex3Main {

    public static void main(String[] args) {
        Map<String, Integer> mapItems = new HashMap<>();
        mapItems.put("Java", 18);
        mapItems.put("Python", 1);
        mapItems.put("Php", 0);

        printMapElements(mapItems);

    }

    public static void printMapElements(Map<String, Integer> mapItems) {
        int counter = 1;

        for (Map.Entry<String, Integer> item : mapItems.entrySet()) {
            if (counter == mapItems.size()) {
                System.out.println("Key: " + item.getKey() + " , Value: " + item.getValue() + " .");
            } else {
                System.out.println("Key: " + item.getKey() + " , Value: " + item.getValue() + " ,");
            }
            counter++;
        }
    }
}

