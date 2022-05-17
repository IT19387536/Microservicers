package com.example.ratingsdataservice.models;

public class Rating {

    public String productId;

    public int rating;


    public Rating(String productId, int rating) {
        this.productId = productId;
        this.rating = rating;
    }

    public String getproductId() {
        return productId;
    }

    public void setproductId(String productId) {
        this.productId = productId;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
