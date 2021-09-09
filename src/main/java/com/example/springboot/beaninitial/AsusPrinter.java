package com.example.springboot.beaninitial;

import com.example.springboot.ioc.Printer;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class AsusPrinter implements Printer {

    private int count;

    // 必須為public void
    @PostConstruct
    public void initialize() {
        count = 5;
    }

    @Override
    public String printer(String message) {
        count--;
        return "AsusPrinter(remind " + count + "): " + message;
    }
}
