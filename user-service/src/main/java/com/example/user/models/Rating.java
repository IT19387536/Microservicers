package com.example.user.models;

public class Rating {
    public String id;
    public int rating;
    public Rating(String id, int rating) {
        this.id = id;
        this.rating = rating;
    }

    public String getProductId() {
        return id;
    }

    public void setProductId(String id) {
        this.id = id;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
