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
