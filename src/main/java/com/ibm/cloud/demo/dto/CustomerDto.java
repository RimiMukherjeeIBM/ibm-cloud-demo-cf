package com.ibm.cloud.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CustomerDto implements Serializable {
    private String _id;
    private String _rev;
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNo;
    private AddressDto address;
}
