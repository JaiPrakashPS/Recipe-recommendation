package com.recipe;

public class Ingredient {
    private String name;
    private double quantity; // Quantity required
    private boolean available; // Indicates if the ingredient is available

    // Constructor
    public Ingredient(String name, double quantity, boolean available) {
        this.name = name;
        this.quantity = quantity;
        this.available = available;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    // Method to check if the ingredient is available
    public void checkAvailability() throws IngredientNotAvailableException {
        if (!available) {
            throw new IngredientNotAvailableException("Ingredient " + name + " is not available.");
        }
    }
}
public class IngredientNotAvailableException extends Exception {
    public IngredientNotAvailableException(String message) {
        super(message);
    }
}

