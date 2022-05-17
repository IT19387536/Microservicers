package com.example.user.models;

import java.util.List;

public class UserComment {
    private String userId;
    private List<Comment> userComment;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public List<Comment> getUserComment() {
        return userComment;
    }

    public void setUserComment(List<Comment> userComment) {
        this.userComment = userComment;
    }
}
