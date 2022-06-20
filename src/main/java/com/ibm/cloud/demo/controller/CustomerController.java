package com.ibm.cloud.demo.controller;

import com.ibm.cloud.demo.model.Customer;
import com.ibm.cloud.demo.service.CustomerService;
//import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @ApiOperation(value="Create customer")
    @PostMapping("/create")
    public String createCustomer(@RequestBody Customer customer){
        final String id = customerService.createCustomer(customer);
        return "Customer is created successfully with id : " + id;
    }

    @ApiOperation(notes = "method will fetch customer by customer id", value = "To fetch customer details", response = Customer.class)
    @GetMapping("/{customerId}")
    public Customer getCustomer(@PathVariable("customerId") String customerId){
        return customerService.fetchCustomer(customerId);
    }

    @PutMapping("/update")
    public void updateCustomer(@RequestBody Customer customer){
        customerService.updateCustomer(customer);
    }

    @DeleteMapping("/delete/{customerId}")
    public void deleteCustomer(@PathVariable("customerId") String customerId){
        customerService.deleteCustomer(customerId);
    }
}
