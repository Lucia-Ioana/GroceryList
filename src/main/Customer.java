package main;

import java.util.Arrays;

public class Customer {
    private Product[] shoppingCart = new Product[3];
    private String clientName;
    private String clientPhoneNumber;
    private long cartValue;

    public Customer(String clientName, String clientPhoneNumber) {
        this.clientName = clientName;
        this.clientPhoneNumber = clientPhoneNumber;
    }

    public void showShoppingCart() {
        if (isCartEmpty()) {
            System.out.println("Your cart is empty");
        } else {
            System.out.println("The products in your cart are: ");
            for (int i = 0; i < shoppingCart.length; i++) {
                Product currentProduct = shoppingCart[i];
                if (currentProduct != null) {
                    System.out.println(i + ". " + currentProduct);
                }
            }
        }
    }

    public boolean isCartEmpty() {
        boolean isEmpty = true;
        for (int i = 0; i < shoppingCart.length; i++) {
            if (shoppingCart[i] != null) {
                isEmpty = false;
                break;
            }
        }
        return isEmpty;
    }

    public void totalCartValue() {
        cartValue = 0;
        if (!isCartEmpty()) {
            for (Product currentProduct : shoppingCart) {
                if (currentProduct != null) {
                    cartValue = (long) (cartValue + currentProduct.getPriceOfProduct());
                }
            }
        }
    }

    public void addToCart(Product currentProduct) {
        int emptyIndex = findFirstEmptyIndex();
        if(emptyIndex != -1){
            shoppingCart[emptyIndex] = currentProduct;
            System.out.println("You successfully added " + currentProduct.getNameOfProduct() + " in your cart!");
        } else {
            System.out.println("Your cart is full, please checkout and pay");
        }
    }

    public int findFirstEmptyIndex() {
        int firstEmptyIndex = -1;
        for (int i = 0; i < shoppingCart.length; i++) {
            if (shoppingCart[i] == null) {
                firstEmptyIndex = i;
                break;
            }

        }
        return firstEmptyIndex;
    }


    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getClientPhoneNumber() {
        return clientPhoneNumber;
    }

    public void setClientPhoneNumber(String clientPhoneNumber) {
        this.clientPhoneNumber = clientPhoneNumber;
    }

    public long getCartValue() {
        return cartValue;
    }

    public void setCartValue(long cartValue) {
        this.cartValue = cartValue;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "shoppingCart=" + Arrays.toString(shoppingCart) +
                ", clientName='" + clientName + '\'' +
                ", clientPhoneNumber='" + clientPhoneNumber + '\'' +
                ", cartValue=" + cartValue +
                '}';
    }
}
