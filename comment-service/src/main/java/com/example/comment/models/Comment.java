package com.example.comment.models;

public class Comment {
    public String productId;
    public String comment;

    public Comment(String productId, String comment) {
        this.productId = productId;
        this.comment = comment;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
