package com.ibm.cloud.demo.repository;

import com.cloudant.client.api.CloudantClient;
import com.cloudant.client.api.Database;
import com.ibm.cloud.demo.dto.CustomerDto;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public interface CloudantRepository<K, V> {

    public CloudantClient getCloudantClient();
    public String getDbName();
    public Database getCloudantDatabase(CloudantClient cloudantClient, String dbName);

    public default Database getCloudantDatabase(){
        return getCloudantDatabase(getCloudantClient(), getDbName());
    }

    public default String save(CustomerDto customerDto){
        return getCloudantDatabase().save(customerDto).getId();
    }

    public default <V> V findById(String id, Class<V> classType) throws Exception{
        return getCloudantDatabase().find(classType, id);
    }

    public default String Update(CustomerDto customerDto){
        return getCloudantDatabase().update(customerDto).getId();
    }
    public default String delete(String id, String rev){
        return getCloudantDatabase().remove(id, rev).getId();
    }
}
