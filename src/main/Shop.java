package main;

import java.util.Scanner;

public class Shop {
    Scanner textScanner = new Scanner(System.in);
    Scanner numbersScanner = new Scanner(System.in);
    private Product[] stockOfProducts = new Product[5];
    private Customer currentCustomer;

    public Shop(Customer currentCustomer) {
        this.currentCustomer = currentCustomer;
    }

    public void populateStockOfProducts() {
        for (int i = 0; i < stockOfProducts.length; i++) {
            System.out.println("Enter the product " + i + " details: ");
            System.out.print("Enter the product's name: ");
            String productName = textScanner.nextLine();
            System.out.print("Enter product's price: ");
            double productPrice = numbersScanner.nextDouble();
            Product currentProduct = new Product(productName, productPrice);
            stockOfProducts[i] = currentProduct;

        }
    }

    public void showStock() {
        System.out.println("Products are: ");
        for (int i = 0; i < stockOfProducts.length; i++) {
            Product currentProduct = stockOfProducts[i];
            if (currentProduct != null) {
                System.out.println(i + "." + currentProduct);
            }
        }
    }

    public void showMenu() {
        System.out.println("=======MENU========");
        System.out.println("1. Show list of products");
        System.out.println("2. Show cart ");
        System.out.println("3. Show total price ");
        System.out.println("4. Checkout and pay");
        System.out.println("5. Leave the shop");
        System.out.println("====================");
    }

    public void startShopping() {
        showMenu();
        int selectedOption;
        do {
            System.out.print("Please choose an option: ");
            selectedOption = numbersScanner.nextInt();
            switch (selectedOption) {
                case 1 -> showStock();
                case 2 -> System.out.println();
                case 3 -> System.out.println();
                case 4 -> System.out.println();
                case 5 -> System.out.println();
                default -> System.out.println();
            }
        } while (selectedOption != 5);
    }



    public Product[] getStockOfProducts() {
        return stockOfProducts;
    }

    public void setStockOfProducts(Product[] stockOfProducts) {
        this.stockOfProducts = stockOfProducts;
    }

    public Customer getCurrentCustomer() {
        return currentCustomer;
    }

    public void setCurrentCustomer(Customer currentCustomer) {
        this.currentCustomer = currentCustomer;
    }
}
