package com.example.petclinic.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Owner extends Person {
    private String address;
    private String city;
    private String telephone;
}
