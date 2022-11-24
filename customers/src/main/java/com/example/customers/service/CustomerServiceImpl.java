package com.example.customers.service;

import com.example.customers.domain.Customer;
import com.example.customers.service.dto.CustomerDTO;
import com.example.customers.repo.CustomerRepo;
import lombok.Data;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Data
@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private ModelMapper modelMapper;
    @Autowired
    private CustomerRepo customerRepo;


    @Override
    public void addCustomer(CustomerDTO customerDTO) {
        Customer customer = modelMapper.map(customerDTO, Customer.class);
        customerRepo.save(customer);

    }

    @Override
    public void updateCustomer(CustomerDTO customerDTO) {
        // get the customer from the database
        // then update the customer
         Customer customer = modelMapper.map(customerDTO, Customer.class);
          customerRepo.save(customer);
//        publisher.publishEvent(new ProductChangeEventDTO(productDto));

    }

    @Override
    public void deleteCustomer(CustomerDTO customerDTO) {
        Customer customer = modelMapper.map(customerDTO, Customer.class);
        customerRepo.delete(customer);
    }

    @Override
    public CustomerDTO getCustomer(String firstName) {
        //convert string to long
//        long id = Long.parseLong(customerId);
        Optional<Customer> result = customerRepo.findByFirstName(firstName);
        if (result.isPresent())
            return modelMapper.map(result.get(), CustomerDTO.class);
        else
            return null;

    }



}
