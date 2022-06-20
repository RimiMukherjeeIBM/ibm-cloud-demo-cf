package com.ibm.cloud.demo.exception.handler;

import com.ibm.cloud.demo.exception.ApiException;
import com.ibm.cloud.demo.exception.ResourceNotFoundException;
import com.ibm.cloud.demo.model.ErrorMessage;
import io.swagger.annotations.Api;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

import javax.servlet.http.HttpServletResponse;
import java.time.OffsetDateTime;
import java.time.ZoneId;

@RestControllerAdvice
public class CustomerExceptionHandler {

    /*@ExceptionHandler(value = {ResourceNotFoundException.class})
    @ResponseStatus(value = HttpStatus.NOT_FOUND)
    public ErrorMessage resourceNotFoundException(ResourceNotFoundException ex, WebRequest request) {
        ErrorMessage message = new ErrorMessage(
                ex.getHttpStatus(),
                OffsetDateTime.now(ZoneId.of("UTC")),
                ex.getMessage(),
                ex.getDescription()
                );

        return message;
    }*/

    @ExceptionHandler(value = {ApiException.class})
    public ErrorMessage apiException(ApiException ex, WebRequest request, HttpServletResponse httpServletResponse) {
        httpServletResponse.setStatus(ex.getHttpStatus().value());
        ErrorMessage message = new ErrorMessage(
                ex.getHttpStatus(),
                OffsetDateTime.now(ZoneId.of("UTC")),
                ex.getMessage(),
                ex.getDescription()
        );

        return message;
    }
}
