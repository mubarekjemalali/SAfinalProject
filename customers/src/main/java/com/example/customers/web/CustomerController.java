package com.example.customers.web;

import com.example.customers.service.CustomerService;
import com.example.customers.service.dto.CustomerDTO;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

@Controller
@Data
@RequiredArgsConstructor
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @PostMapping("customers/addCustomer")
    public ResponseEntity<String> addCustomer (CustomerDTO customerDTO) {
        System.out.println("add customer method");
        customerService.addCustomer(customerDTO);
        return ResponseEntity.ok("customer added successfully");
    }

    @PutMapping("/updateCustomer")
    public void updateCustomer (CustomerDTO customerDTO) {
        customerService.updateCustomer(customerDTO);
    }

    @PutMapping("/deleteCustomer")
    public void deleteCustomer (CustomerDTO customerDTO) {
        customerService.deleteCustomer(customerDTO);
    }

    @GetMapping("customers/getCustomer/{firstName}")
    public ResponseEntity<Object> getCustomer (@PathVariable String firstName) {
        System.out.println("get customer method");
        CustomerDTO customerDTO = customerService.getCustomer(firstName);
        return ResponseEntity.ok(customerDTO);
    }

}
