package lld.BikeRentalShopLLD.model;

public enum Category {
    SMALL("small"),
    MEDIUM("medium"),
    LARGE("LARGE");


    private final String category;

    Category(String category) {
        this.category = category;
    }

    private String getCategory() {
        return this.category;
    }
}
