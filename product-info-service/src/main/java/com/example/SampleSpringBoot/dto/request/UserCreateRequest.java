package com.example.SampleSpringBoot.dto.request;

import lombok.Data;

@Data
public class UserCreateRequest {

    private int id;

    private String firstName;

    private String lastName;

    private String email;

    private String contactNumber;

    private String password;
}
