package com.example.customers.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class Address {

    String street;
    String city;
    String state;
    String zip;
}
