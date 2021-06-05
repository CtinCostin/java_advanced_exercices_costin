package com.sda.vendingmachine;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VendingMachineMain {

    public static void main(String[] args) {


        //            simulateVending();
        //     getDrinkProducts();
        //     getSnacksProducts();
        money();

    }

    private static void getDrinkProducts() {

        SoftDrinks drinkProduct1 = new SoftDrinks("Fanta", 5, 1, true);
        SoftDrinks drinkProduct2 = new SoftDrinks("Coca Cola", 5, 2, true);
        SoftDrinks drinkProduct3 = new SoftDrinks("Prigat", 6, 3, false);
        SoftDrinks drinkProduct4 = new SoftDrinks("Cappy", 6, 4, false);

        List<SoftDrinks> softDrinksProductsList = new ArrayList<>();
        softDrinksProductsList.add(drinkProduct1);
        softDrinksProductsList.add(drinkProduct2);
        softDrinksProductsList.add(drinkProduct3);
        softDrinksProductsList.add(drinkProduct4);

        for (int i = 0; i < softDrinksProductsList.size(); i++) {
            System.out.println(softDrinksProductsList.get(i));
        }
    }

    private static void getSnacksProducts() {

        Products snackProduct1 = new Snacks("Lays", 7, 5, "bag");
        Products snackProduct2 = new Snacks("Alune", 4, 6, "can");
        Products snackProduct3 = new Snacks("Sticks", 5, 7, "box");
        Products snackProduct4 = new Snacks("Waffers", 8, 8, "Package");


        List<Products> snacksProductsList = new ArrayList<>();
        snacksProductsList.add(snackProduct1);
        snacksProductsList.add(snackProduct2);
        snacksProductsList.add(snackProduct3);
        snacksProductsList.add(snackProduct4);


        for (Products element : snacksProductsList) {
            System.out.println(element);
        }
    }

    public static void money() {

        List<Integer> paperMoney = new ArrayList<>();
        paperMoney.add(1);
        paperMoney.add(5);
        paperMoney.add(10);
        paperMoney.add(50);
        paperMoney.add(100);

        for (Integer element : paperMoney) {
            System.out.println("Bancnotele acceptate sunt : " + element);
        }
    }


    public static void simulateVending() {
        Scanner scanner = new Scanner(System.in);
        getSnacksProducts();
        getDrinkProducts();
        System.out.println("Alege un produs din lista de produse disponibile introducand codul produsului:");
        //        codeChosenByUser = scanner.nextInt();
//        Product chosenProduct = findProductByCode(codeChosenByUser);
//        if (chosenProduct != null) {
//            System.out.println("Pretul produsului ales este : " + chosenProduct.getPrice() + " lei \n ");
//            System.out.println("Introdu suma pe care vrei sa o platesti");
//            payProduct(chosenProduct);
    }

//    public static void simulateVending() {
//
//        List<String> itemsList = new ArrayList<>();
//
//        Scanner scanner = new Scanner(System.in);
//
//        String item = " ";
//        while(true) -> reprezinta un loop infinit
//        while (true) {
//            System.out.println("Element : ");
//            citim de la tastatura
//            item = scanner.nextLine();
//
//            if (item.equals("stop")) {
//                break;
//            }
//            if (itemsList.contains(item)) {
//                System.out.println("Elementul este deja prezent");
//                System.out.println("Doresti sa il stergi? (y/n)");
//
//                citim raspunsul dat de user
//                String response = scanner.next();
//
//                if (response.equals("y")) {
//                    itemsList.remove(item);
//                    break;
//                }
//            } else {
//                adaugam elementul in lista
//                itemsList.add(item);
//            }
//        }
//
//         afisam rezultatele
//        for (String element : itemsList) {
//            if (element.startsWith("m")) {
//                System.out.println(element);
//
//
//           }
//     }
//   }

}

