package org.company.hotelbooking.exception;

import org.springframework.http.HttpStatus;

public class ExceptionBusiness extends ExceptionApi {
    public ExceptionBusiness(String message) {
        super(message, HttpStatus.BAD_REQUEST);
    }
}
