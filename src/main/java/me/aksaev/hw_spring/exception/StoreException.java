package me.aksaev.hw_spring.exception;

import me.aksaev.hw_spring.controller.StoreController;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;

@RestControllerAdvice(basePackageClasses = StoreController.class)
public class StoreException {
    @ExceptionHandler(MethodArgumentTypeMismatchException.class)
    public String handleMethodArgumentTypeMismatchException() {
        return "Некорректный параметр запроса!";
    }
}
