// Recommendation.java
package com.recipe;

import java.util.ArrayList;
import java.util.HashMap;

public class Recommendation {
    private ArrayList<Recipe> recipes;

    public Recommendation() {
        this.recipes = new ArrayList<>();
    }

    public void addRecipe(Recipe recipe) {
        recipes.add(recipe);
    }

    public ArrayList<Recipe> findRecipes(User user) {
        ArrayList<Recipe> recommendedRecipes = new ArrayList<>();
        HashMap<String, Double> userInventory = user.getInventory();

        for (Recipe recipe : recipes) {
            boolean canMake = true;
            for (Ingredient ingredient : recipe.getIngredients()) {
                if (!userInventory.containsKey(ingredient.getName()) ||
                    userInventory.get(ingredient.getName()) < ingredient.getQuantity()) {
                    canMake = false;
                    break;
                }
            }
            if (canMake) {
                recommendedRecipes.add(recipe);
            }
        }
        return recommendedRecipes;
    }
}
