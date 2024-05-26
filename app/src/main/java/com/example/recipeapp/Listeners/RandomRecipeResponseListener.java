package com.example.recipeapp.Listeners;

import com.example.recipeapp.Models.RandomRecipeAppResponse;

public interface RandomRecipeResponseListener {
    void didFetch(RandomRecipeAppResponse response, String message);
    void didError(String message);
}
