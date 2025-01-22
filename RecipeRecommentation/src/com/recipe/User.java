// User.java
package com.recipe;

import java.util.HashMap;

public class User {
    private int userId;
    private String name;
    private HashMap<String, Double> inventory; 

    public User(int userId, String name) {
        this.userId = userId;
        this.name = name;
        this.inventory = new HashMap<>();
    }

    public int getUserId() { return userId; }
    public String getName() { return name; }
    public HashMap<String, Double> getInventory() { return inventory; }

    public void updateInventory(String ingredient, double quantity) {
        inventory.put(ingredient, inventory.getOrDefault(ingredient, 0.0) + quantity);
    }
}
