package com.example.ratingsdataservice.resources;

import com.example.ratingsdataservice.models.Rating;
import com.example.ratingsdataservice.models.UserRating;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("ratingsdata")
public class RatingsDataResources {
	
	 @GetMapping("/welcomeRating")
		public String welcome() {
			return "welcom to Product Rating Service!";
		}
	 
    @RequestMapping("/{productId}")
    public Rating getRatings(@PathVariable ("productId") String productId){
        return new Rating(productId, 4);
    }

    @RequestMapping("user/{userId}")
    public UserRating getUserRatings(@PathVariable ("userId") String userId){
        List<Rating> ratings = Arrays.asList(
                new Rating("1234", 4),
                new Rating("5678",3)
        );
        UserRating userRating = new UserRating();
        userRating.setUserRating(ratings);
        return userRating;
    }
       
}
