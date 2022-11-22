package com.example.customers.service;

import com.example.customers.service.dto.CustomerDTO;
import org.springframework.stereotype.Service;

@Service
public interface CustomerService {
    public void addCustomer (CustomerDTO customerDTO);
    public void updateCustomer (CustomerDTO customerDTO);
    public void deleteCustomer (CustomerDTO customerDTO);

    CustomerDTO getCustomer(String customerId);
}
