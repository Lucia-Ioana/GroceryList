package main;

import java.util.Scanner;

public class Shop {
    Scanner textScanner = new Scanner(System.in);
    Scanner numbersScanner = new Scanner(System.in);
    private Product[] stockOfProducts = new Product[3];
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
        System.out.println("3. Add product to cart ");
        System.out.println("4. Show your total cart value");
        System.out.println("5. Checkout and pay");
        System.out.println("6. Leave the shop");
        System.out.println("====================");
    }

    public void startShopping() {
        int selectedOption;
        do {
            showMenu();
            System.out.print("Please choose an option: ");
            selectedOption = numbersScanner.nextInt();
            switch (selectedOption) {
                case 1 -> showStock();
                case 2 -> currentCustomer.showShoppingCart();
                case 3 -> addProduct();
                case 4 -> {
                    currentCustomer.totalCartValue();
                    System.out.println("You have to pay: " + currentCustomer.getCartValue() + " RON");
                }
                case 5 -> checkoutAndPay();
                case 6 -> exitShop();
                default -> System.out.println("Please choose a valid option!!");
            }
        } while (selectedOption != 6);
    }

    public void exitShop() {
        currentCustomer.totalCartValue();
        if (currentCustomer.getCartValue() > 0) {
            checkoutAndPay();
        }
        System.out.println("Thank you for choosing us. Goodbye!");
    }

    public void checkoutAndPay() {
        currentCustomer.totalCartValue();
        double totalCartValue = currentCustomer.getCartValue();
        System.out.println("You have to pay " + currentCustomer.getCartValue() + " RON");
        if (totalCartValue != 0.0) {
            System.out.print("Enter the amount you have to pay: ");
            double amount = numbersScanner.nextDouble();
            if (amount >= totalCartValue) {
                double remainingAmount = amount - totalCartValue;
                System.out.println("You have " + remainingAmount + " RON left");
            } else {
                System.out.println("Insufficient money!");
            }
        }
    }

    public void addProduct() {
        showStock();
        System.out.print("Choose the number of product you want to add in your cart: ");
        int option = numbersScanner.nextInt();
        Product currentProduct = stockOfProducts[option];
        currentCustomer.addToCart(currentProduct);
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
