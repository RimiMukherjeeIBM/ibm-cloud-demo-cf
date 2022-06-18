package com.ibm.cloud.demo.mapper;

import com.ibm.cloud.demo.dto.CustomerDto;
import com.ibm.cloud.demo.model.Customer;
import org.springframework.stereotype.Component;

@Component
public class CustomerMapper {

    public CustomerDto getCustomer(Customer customer){
        final CustomerDto customerDto = new CustomerDto();
        customerDto.set_id(customer.getCustomerId());
        customerDto.setFirstName(customer.getFirstName());
        customerDto.setLastName(customer.getLastName());
        return customerDto;
    }

    public Customer getCustomer(CustomerDto customerDto){
        final Customer customer = new Customer();
        customer.setCustomerId(customerDto.get_id());
        customer.setFirstName(customerDto.getFirstName());
        customer.setLastName(customerDto.getLastName());
        return customer;
    }
}
