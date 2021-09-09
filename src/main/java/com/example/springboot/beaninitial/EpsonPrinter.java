package com.example.springboot.beaninitial;

import com.example.springboot.ioc.Printer;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class EpsonPrinter implements Printer {

    private int epsonCount;

    // @Override
    // public void afterPropertiesSet() {
    //     count = 5;
    // }

    @PostConstruct
    public void step() {
        epsonCount = 5;
    }

    @Override
    public String printer(String message) {
        epsonCount--;
        return "EpsonPrinter(remind " + epsonCount + "): " + message;
    }
}
