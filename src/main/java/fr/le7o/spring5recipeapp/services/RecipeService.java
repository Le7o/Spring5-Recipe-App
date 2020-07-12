package fr.le7o.spring5recipeapp.services;

import fr.le7o.spring5recipeapp.domain.Recipe;

import java.util.Set;

public interface RecipeService {
    Set<Recipe> getRecipes();
}
