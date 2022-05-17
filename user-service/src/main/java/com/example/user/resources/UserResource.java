package com.example.user.resources;

import com.example.user.models.Item;
import com.example.user.models.Product;
import com.example.user.models.UserComment;
import com.example.user.models.UserRating;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/user")
public class UserResource {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    //private WebClient.Builder webclientBuilder;

    @RequestMapping("/{userId}")
    public List<Item> getCatalog(@PathVariable("userId") String userId) {

        UserRating userRating = restTemplate.getForObject("http://ratings-data-service/ratingsdata/user/" + userId,
                UserRating.class);
        return userRating.getUserRating().stream()
                .map(rating -> {
                    Product product = restTemplate.getForObject("http://localhost:8080/api/product" + rating.getProductId(),
                            Product.class);
                    return new Item(product.getName(), product.getPrice(), rating.getRating());
                })
                .collect(Collectors.toList());

    }


  }


