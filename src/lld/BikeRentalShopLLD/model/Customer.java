package lld.BikeRentalShopLLD.model;


import java.util.List;

public class Customer {
    String customerName;
    String customerId;
    Category category;
    int height;
    List<Booking> bookingsHistory;

    public Category getCategory() {
        return category;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }
    public void setCategory(Category category) {
        this.category = category;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    int weight;
}
