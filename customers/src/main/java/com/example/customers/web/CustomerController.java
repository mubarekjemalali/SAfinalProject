package com.example.customers.web;

import com.example.customers.service.CustomerService;
import com.example.customers.service.dto.CustomerDTO;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

@Controller
@Data
@RequiredArgsConstructor
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @PostMapping("/addCustomer")
    public void addCustomer (CustomerDTO customerDTO) {
        customerService.addCustomer(customerDTO);
    }

    @PutMapping("/updateCustomer")
    public void updateCustomer (CustomerDTO customerDTO) {
        customerService.updateCustomer(customerDTO);
    }

    @PutMapping("/deleteCustomer")
    public void deleteCustomer (CustomerDTO customerDTO) {
        customerService.deleteCustomer(customerDTO);
    }

    @GetMapping("/getCustomer")
    public ResponseEntity<CustomerDTO> getCustomer (String customerId) {
        CustomerDTO customerDTO = customerService.getCustomer(customerId);
        return ResponseEntity.ok(customerDTO);
    }

}
