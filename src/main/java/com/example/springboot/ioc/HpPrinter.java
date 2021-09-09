package com.example.springboot.ioc;

import org.springframework.stereotype.Component;

@Component
public class HpPrinter implements Printer{

    @Override
    public String printer(String message) {
        return "HP Printer: " + message;
    }
}
