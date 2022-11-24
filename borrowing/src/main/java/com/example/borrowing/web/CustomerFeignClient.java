package com.example.borrowing.web;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


@FeignClient(name = "CustomerService")
interface CustomerFeignClient{
    @RequestMapping("/customer/{customerNumber}")
    public String getCustomerName(@PathVariable int customerNumber);
}