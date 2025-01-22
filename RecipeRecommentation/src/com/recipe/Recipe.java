// Recipe.java
package com.recipe;

import java.util.ArrayList;

public class Recipe {
    private int recipeId;
    private String name;
    private RecipeType type; // Recipe type defined using the enum
    private ArrayList<Ingredient> ingredients;
    private String instructions;

    public Recipe(int recipeId, String name, RecipeType type, String instructions) {
        this.recipeId = recipeId;
        this.name = name;
        this.type = type;
        this.instructions = instructions;
        this.ingredients = new ArrayList<>();
    }

    public int getRecipeId() { return recipeId; }
    public String getName() { return name; }
    public RecipeType getType() { return type; }
    public ArrayList<Ingredient> getIngredients() { return ingredients; }

    public void addIngredient(Ingredient ingredient) {
        ingredients.add(ingredient);
    }

    public void displayRecipeDetails() {
        System.out.println("Recipe: " + name);
        System.out.println("Type: " + type);
        System.out.println("Ingredients:");
        for (Ingredient ingredient : ingredients) {
            System.out.println("- " + ingredient.getName() + ": " + ingredient.getQuantity() + " " + ingredient.getUnit());
        }
        System.out.println("Instructions: " + instructions);
    }
}
