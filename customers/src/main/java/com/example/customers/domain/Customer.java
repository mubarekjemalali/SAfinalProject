package com.example.customers.domain;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
@RequiredArgsConstructor

public class Customer {


    @Id
    int customerNumber;
    String firstName;
    String lastName;
    String phone;
    String email;
    Address address;


}
 