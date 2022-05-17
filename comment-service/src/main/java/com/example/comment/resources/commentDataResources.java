package com.example.comment.resources;

import com.example.comment.models.Comment;
import com.example.comment.models.UserComment;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("commentdata")
public class commentDataResources {

    @RequestMapping("/{productId}")
    public Comment getComments(@PathVariable("productId") String productId){
        return new Comment(productId, "Awesome");
    }

    @RequestMapping("user/{userId}")
    public UserComment getUserComments(@PathVariable ("userId") String userId){
        List<Comment> comments = Arrays.asList(
                new Comment("P1", "Nice"),
                new Comment("P2","Superb")
        );
        UserComment userComment = new UserComment();
        userComment.setUserComment(comments);
        return userComment;
    }
}
