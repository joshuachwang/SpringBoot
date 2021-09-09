package com.example.springboot.configurationAndBean;

import com.example.springboot.ioc.Printer;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigurationController {

    private final Printer printer1;
    private final Printer printer2;

    public ConfigurationController(@Qualifier("myHpPrinter") Printer printer1, @Qualifier("myCanonPrinter") Printer printer2) {
        this.printer1 = printer1;
        this.printer2 = printer2;
    }

    @RequestMapping("/hpprinter")
    public String hpController() {
        return printer1.printer("Configuration Bean example");
    }

    @RequestMapping("/canonprinter")
    public String canonController() {
        return printer2.printer("Configuration Bean example");
    }
}
