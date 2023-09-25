package ra.entity;

import ra.util.InputMethod;

import java.util.Scanner;

public class Product {
    private String productId;
    private String productName;
    private String manufacturer;
    private boolean productStatus;

    public Product() {
    }

    public Product(String productId, String productName, String manufacturer, boolean productStatus) {
        this.productId = productId;
        this.productName = productName;
        this.manufacturer = manufacturer;
        this.productStatus = productStatus;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public boolean isProductStatus() {
        return productStatus;
    }

    public void setProductStatus(boolean productStatus) {
        this.productStatus = productStatus;
    }
    public void inputData(){

        System.out.println("nhập tên sp");
        this.productName = InputMethod.getString();
        System.out.println("Nhập nhà sản xuất");
        this.manufacturer = InputMethod.getString();
        System.out.println("Nhập trạng thái");
        this.productStatus = InputMethod.getBoolean();
    }

    public void displayData(){
        System.out.printf("ID : %4s | ProductName : %-20s | " +
                "\nManufacturer: %10s | Status : %s \n",
                this.productId,this.productName ,
                this.manufacturer,
                (this.productStatus?"Bán":"Không bán"));


    }
}

