package com.ibm.cloud.demo.repository;

import com.ibm.cloud.demo.dto.CustomerDto;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CustomerRepository extends MongoRepository<CustomerDto, String> {

}
