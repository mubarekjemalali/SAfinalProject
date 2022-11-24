package com.example.customers.service.dto;

import com.example.customers.service.dto.AddressDTO;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Data
@NoArgsConstructor
public class CustomerDTO {

        int customerNumber;
        String firstName;
        String lastName;
        String phone;
        String email;

        AddressDTO address;

}
