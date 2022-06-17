package com.ibm.cloud.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class AddressDto implements Serializable {
    private String city;
    private String streetName;
    private String addressLine1;
    private String addressLine2;
    private String pinCode;
    private String state;
    private String country;
}
