package com.sda.ex5;


/**Implement the SDAHashSet  class that will implement the HashSet  logic. It should support methods:
 • add
 • remove
 • size
 • contains
 • clear
*/

public class Ex5Main {

    public static void main(String[] args) {

        SDAHashSet<String> sdaHashSet = new SDAHashSet<>();
        sdaHashSet.add("Cox");
        sdaHashSet.add("Tibi");
        sdaHashSet.add("Cox");

        System.out.println(sdaHashSet.size());

        sdaHashSet.remove("Tibi");

        System.out.println(sdaHashSet.size());

        if (sdaHashSet.contains("Ion")){
            System.out.println("Sda contains true");
        }

        sdaHashSet.clear();
        System.out.println(sdaHashSet.size());

    }
}
