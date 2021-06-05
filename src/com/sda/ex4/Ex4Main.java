package com.sda.ex4;

/** 4.Create a Storage class that will have a private
 * Map field, a public constructor, and methods:
 * addToStorage(String key, String value)→adding elements to the storage
 * printValues(String key)→ displaying all elements under a given key
 * findValues(String value)→ displaying all keys that have a given value
 * TheStorage class should allow you to store multiple values under one key
 */

public class Ex4Main {

    public static void main(String[] args) {

        Storage storage = new Storage();
        storage.addToStorage("Tool","Hammer");
        storage.addToStorage("Auto","Honda");
        storage.addToStorage("Phone", "Iphone");
        storage.addToStorage("Race","Honda");

        storage.addToStorage("Tool","Screw");
        storage.addToStorage("Auto","BMW");
        storage.addToStorage("Phone","Samsung");

        storage.printStorage();

        System.out.println("The value is : ");
        storage.printValues("Auto");

        System.out.println("The keys are : ");
        storage.findValues("Honda");

    }
}
