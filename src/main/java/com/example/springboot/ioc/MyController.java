package com.example.springboot.ioc;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    private final Printer printer;

    public MyController(@Qualifier("canonPrinter") Printer printer) {
        this.printer = printer;
    }

    @RequestMapping("/test")
    public String test() {
        printer.printer("Who am i");
        return "Hello World";
    }
}
