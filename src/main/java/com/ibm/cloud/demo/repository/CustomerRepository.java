package com.ibm.cloud.demo.repository;

import com.cloudant.client.api.CloudantClient;
import com.cloudant.client.api.Database;
import com.ibm.cloud.demo.dto.CustomerDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

@Repository
public class CustomerRepository implements CloudantRepository<String, CustomerDto> {
    @Autowired
    CloudantClient cloudantClient;
    @Value("${cloudant.dbname}")
    String dbName;

    @Override
    public CloudantClient getCloudantClient() {
        return cloudantClient;
    }

    @Override
    public String getDbName() {
        return dbName;
    }

    @Override
    public Database getCloudantDatabase(CloudantClient cloudantClient, String dbName){
        return cloudantClient.database(dbName, false);
    }



}
