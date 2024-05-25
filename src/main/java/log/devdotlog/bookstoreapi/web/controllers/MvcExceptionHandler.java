package log.devdotlog.bookstoreapi.web.controllers;

import jakarta.validation.ConstraintViolation;
import jakarta.validation.ConstraintViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@ControllerAdvice
public class MvcExceptionHandler {
    @ExceptionHandler(ConstraintViolationException.class)
    public ResponseEntity<List> validationErrorHandler(ConstraintViolationException e) {
        Set<ConstraintViolation<?>> constraintViolationSet = e.getConstraintViolations();
        List<String> errorList = new ArrayList<>(constraintViolationSet.size());
        constraintViolationSet.forEach(error -> errorList.add(error.toString()));
        return new ResponseEntity<>(errorList, HttpStatus.BAD_REQUEST);
    }
}
