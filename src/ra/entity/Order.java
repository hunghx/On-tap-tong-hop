package ra.entity;

import java.util.Date;
import java.util.Scanner;

public class Order {
    private  String orderId;
    private  int quantity;
    private  String productId;
    private  Date created;
    private  int userCreatedId;
    private Date updated;
    private  int userUpdatedId;
    private  boolean orderType;
    private  float price;
    private  int orderStatus;

    public Order() {
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public int getUserCreatedId() {
        return userCreatedId;
    }

    public void setUserCreatedId(int userCreatedId) {
        this.userCreatedId = userCreatedId;
    }

    public Date getUpdated() {
        return updated;
    }

    public void setUpdated(Date updated) {
        this.updated = updated;
    }

    public int getUserUpdatedId() {
        return userUpdatedId;
    }

    public void setUserUpdatedId(int userUpdatedId) {
        this.userUpdatedId = userUpdatedId;
    }

    public boolean isOrderType() {
        return orderType;
    }

    public void setOrderType(boolean orderType) {
        this.orderType = orderType;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(int orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Order(String orderId, int quantity, String productId, Date created, int userCreatedId, Date updated, int userUpdatedId, boolean orderType, float price, int orderStatus) {
        this.orderId = orderId;
        this.quantity = quantity;
        this.productId = productId;
        this.created = created;
        this.userCreatedId = userCreatedId;
        this.updated = updated;
        this.userUpdatedId = userUpdatedId;
        this.orderType = orderType;
        this.price = price;
        this.orderStatus = orderStatus;
    }
    public void inputData(){
        Scanner scanner =new Scanner(System.in);
        // input
    }
    public void displayData(){

    }
    public double calPriceExport (){
        return this.price*1.1;
    }
}
