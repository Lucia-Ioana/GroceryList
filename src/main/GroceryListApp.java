package main;

import java.util.Scanner;

public class GroceryListApp {
    public static void main(String[] args) {

        Scanner textScanner = new Scanner(System.in);
        Scanner numbersScanner = new Scanner(System.in);
        System.out.print("Enter your userName : ");
        String userName = textScanner.nextLine();
        System.out.print("Enter phone number: ");
        String phoneNumber = textScanner.nextLine();

        Customer currentCustomer = new Customer(userName,phoneNumber);
        Shop shop = new Shop(currentCustomer);
        shop.populateStockOfProducts();
        shop.startShopping();


    }
}
