package com.example.springboot.ioc;

import org.springframework.stereotype.Component;

@Component
public class CanonPrinter implements Printer {

    @Override
    public String printer(String message) {
        return "Canon Printer: " + message;
    }
}
