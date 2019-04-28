package twc.springframework.services;


import twc.springframework.domain.Recipe;

import java.util.Set;


public interface RecipeService {

    Set<Recipe> getRecipes();
}
