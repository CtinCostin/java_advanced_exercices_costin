package com.sda.vendingmachine;

import java.util.List;
import java.util.Scanner;

public class VendingMachine {

    Scanner scanner = new Scanner(System.in);



//    private void payProduct(List<Products> product) {
//        int pricePayedByUser = scanner.nextInt();
//        int change = giveChange(pricePayedByUser, product.());
//        System.out.println("Aici aveti produsul " + product.getName() + " si restul " + change);


 //   }

    public int giveChange(int sumFromClient, int sumProduct) {
        int change = 0;

        if (sumFromClient < sumProduct) {
            int restToBePayed = sumProduct - sumFromClient;
            System.out.println("Ai introdus o suma mai mica decat pretul produsului " + restToBePayed);
            int pricePayedByUser = scanner.nextInt();
            change = giveChange(pricePayedByUser, restToBePayed);
        } else if (sumFromClient > sumProduct) {
            change = sumFromClient - sumProduct;

        }
        return change;
    }
}