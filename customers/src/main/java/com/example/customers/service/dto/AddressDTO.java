package com.example.customers.service.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class AddressDTO {

    String street;
    String city;
    String state;
    String zip;

}
