package com.ibm.cloud.demo.service;

import com.ibm.cloud.demo.mapper.CustomerMapper;
import com.ibm.cloud.demo.model.Customer;
import com.ibm.cloud.demo.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;

@Service
public class CustomerService {

    @Autowired
    private CustomerMapper customerMapper;

    @Autowired
    private CustomerRepository customerRepository;

    public String createCustomer(Customer customer){
        return customerRepository.save(customerMapper.getCustomer(customer)).getId();
    }

    public Customer fetchCustomer(String customerId){
        return customerMapper.getCustomer(customerRepository.findById(customerId).orElseThrow(() -> new HttpClientErrorException(HttpStatus.NOT_FOUND)));
    }

    public void updateCustomer(Customer customer){

    }

    public void deleteCustomer(String id){

    }
}
