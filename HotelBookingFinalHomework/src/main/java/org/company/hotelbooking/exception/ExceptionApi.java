package org.company.hotelbooking.exception;

import lombok.Data;
import org.springframework.http.HttpStatus;

@Data
public class ExceptionApi extends RuntimeException {
    private HttpStatus httpStatus;

    public ExceptionApi(String message, HttpStatus status) {
        super(message);
        httpStatus = status;
    }
}
