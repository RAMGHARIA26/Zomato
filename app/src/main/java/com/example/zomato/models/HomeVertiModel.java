package com.example.zomato.models;

public class HomeVertiModel {
    int productItemImage;
    String productName;
    String productInfo;
    String productRate;

    public HomeVertiModel(int productItemImage, String productName, String productInfo,String productRate) {
        this.productItemImage = productItemImage;
        this.productName = productName;
        this.productInfo = productInfo;
        this.productRate = productRate;
    }

    public String getProductRate() {
        return productRate;
    }

    public void setProductRate(String productRate) {
        this.productRate = productRate;
    }

    public int getProductItemImage() {
        return productItemImage;
    }

    public void setProductItemImage(int productItemImage) {
        this.productItemImage = productItemImage;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductInfo() {
        return productInfo;
    }

    public void setProductInfo(String productInfo) {
        this.productInfo = productInfo;
    }
}
