package com.ibm.cloud.demo.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.http.HttpStatus;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ResourceNotFoundException extends RuntimeException {
    private HttpStatus httpStatus;
    private String message;
    private String description;
    private Throwable cause;

}
