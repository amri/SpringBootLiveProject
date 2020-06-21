package com.liveproject.commerce.ecommerce;

public class ShopItem {
    private final String itemName;
    private final double price;

    public ShopItem(String itemName, double price) {

        this.itemName = itemName;
        this.price = price;
    }

    public String getItemName() {
        return itemName;
    }

    public double getPrice() {
        return price;
    }
}
