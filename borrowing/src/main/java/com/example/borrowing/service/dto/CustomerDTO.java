package com.example.borrowing.service.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class CustomerDTO {

    int customerNumber;
    String firstName;
    String lastName;
    String phone;
    String email;

}
