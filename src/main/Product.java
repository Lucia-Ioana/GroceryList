package main;

public class Product {
   private String nameOfProduct;
   private long priceOfProduct;


    public Product() {
    }

    public Product(String nameOfProduct, long priceOfProduct) {
        this.nameOfProduct = nameOfProduct;
        this.priceOfProduct = priceOfProduct;
    }

    public void showProduct(){

    }

    public String getNameOfProduct() {
        return nameOfProduct;
    }

    public void setNameOfProduct(String nameOfProduct) {
        this.nameOfProduct = nameOfProduct;
    }

    public double getPriceOfProduct() {
        return priceOfProduct;
    }

    public void setPriceOfProduct(long priceOfProduct) {
        this.priceOfProduct = priceOfProduct;
    }


    @Override
    public String toString() {
        return "Product{" +
                "nameOfProduct='" + nameOfProduct + '\'' +
                ", priceOfProduct=" + priceOfProduct/100 + " RON" +
                '}';
    }
}
