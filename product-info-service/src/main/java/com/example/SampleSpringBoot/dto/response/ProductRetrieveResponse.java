package com.example.SampleSpringBoot.dto.response;

import lombok.Data;

@Data
public class ProductRetrieveResponse {

    private String name;

    private String price;

    private int quantity;
}
