package com.ibm.cloud.demo.mapper;

import com.ibm.cloud.demo.dto.AddressDto;
import com.ibm.cloud.demo.dto.CustomerDto;
import com.ibm.cloud.demo.model.Address;
import com.ibm.cloud.demo.model.Customer;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class CustomerMapper {

    public CustomerDto getCustomer(Customer customer) {
        final CustomerDto customerDto = new CustomerDto();
        customerDto.set_id(customer.getCustomerId());
        customerDto.setFirstName(customer.getFirstName());
        customerDto.setLastName(customer.getLastName());
        customerDto.setPhoneNo(customer.getPhoneNo());
        customerDto.setEmail(customer.getEmail());
        Optional.ofNullable(customer.getAddress()).ifPresent(address -> {
            final AddressDto addressDto = new AddressDto();
            addressDto.setAddressLine1(address.getAddressLine1());
            addressDto.setAddressLine2(address.getAddressLine2());
            addressDto.setCity(address.getCity());
            addressDto.setCountry(address.getCountry());
            addressDto.setState(address.getState());
            addressDto.setPinCode(address.getPinCode());
            addressDto.setStreetName(address.getStreetName());
            customerDto.setAddress(addressDto);
        });
        return customerDto;
    }

    public Customer getCustomer(CustomerDto customerDto) {
        final Customer customer = new Customer();
        customer.setCustomerId(customerDto.get_id());
        customer.setFirstName(customerDto.getFirstName());
        customer.setLastName(customerDto.getLastName());
        customer.setPhoneNo(customerDto.getPhoneNo());
        customer.setEmail(customerDto.getEmail());
        Optional.ofNullable(customerDto.getAddress()).ifPresent(addressDto -> {
            final Address address = new Address();
            address.setAddressLine1(addressDto.getAddressLine1());
            address.setAddressLine2(addressDto.getAddressLine2());
            address.setCity(addressDto.getCity());
            address.setCountry(addressDto.getCountry());
            address.setState(addressDto.getState());
            address.setPinCode(addressDto.getPinCode());
            address.setStreetName(addressDto.getStreetName());
            customer.setAddress(address);
        });
        return customer;
    }
}
