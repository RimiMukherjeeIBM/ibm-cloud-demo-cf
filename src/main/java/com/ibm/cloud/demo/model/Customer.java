package com.ibm.cloud.demo.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Customer implements Serializable {
    private String customerId;
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNo;
    private Address address;
    private String revision;
}
