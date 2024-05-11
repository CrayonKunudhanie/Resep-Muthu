package com.example.resepmuthu.Models;

import java.util.ArrayList;

public class RandomRecipeApiResponse {
    public ArrayList<Recipe> recipes;

    public void didError(String message) {
    }

    public void didFecth(RandomRecipeApiResponse body, String message) {
    }
}
