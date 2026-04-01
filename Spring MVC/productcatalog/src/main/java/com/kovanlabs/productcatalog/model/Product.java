package com.kovanlabs.productcatalog.model;

public class Product {
    private int productId;
    private String productName;
    private double productPrice;

    Product(){

    }
    Product(int productId, String productName, double productPrice){
        this.productId = productId;
        this.productName= productName;
        this.productPrice= productPrice;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getProductDescription() {
        return productPrice;
    }

    public void setProductDescription(double productPrice) {
        this.productPrice = productPrice;
    }

}
