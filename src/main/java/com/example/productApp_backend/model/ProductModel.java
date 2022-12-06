package com.example.productApp_backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="product1")
public class ProductModel {
    @Id
    @GeneratedValue
    private int id;
    private int productCode;
    private String productName;
    private String manufactureDate;
    private String expDate;
    private String brand;
    private int price;
    private String sellerName;
    private String distributorName;

    public ProductModel() {
    }

    public ProductModel(int id, int productCode, String productName, String manufactureDate, String expDate, String brand, int price, String sellerName, String distributorName) {
        this.id = id;
        this.productCode = productCode;
        this.productName = productName;
        this.manufactureDate = manufactureDate;
        this.expDate = expDate;
        this.brand = brand;
        this.price = price;
        this.sellerName = sellerName;
        this.distributorName = distributorName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getProductCode() {
        return productCode;
    }

    public void setProductCode(int productCode) {
        this.productCode = productCode;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(String manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    public String getExpDate() {
        return expDate;
    }

    public void setExpDate(String expDate) {
        this.expDate = expDate;
    }

    public String getBrand() {
        return brand;
    }

    public void setBand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getSellerName() {
        return sellerName;
    }

    public void setSellerName(String sellerName) {
        this.sellerName = sellerName;
    }

    public String getDistributorName() {
        return distributorName;
    }

    public void setDistributorName(String distributorName) {
        this.distributorName = distributorName;
    }
}
