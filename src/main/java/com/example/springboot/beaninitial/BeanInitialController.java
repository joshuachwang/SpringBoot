package com.example.springboot.beaninitial;

import com.example.springboot.ioc.Printer;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BeanInitialController {

    private final Printer printer1;
    private final Printer printer2;

    public BeanInitialController(@Qualifier("asusPrinter") Printer printer1, @Qualifier("epsonPrinter") Printer printer2) {
        this.printer1 = printer1;
        this.printer2 = printer2;
    }

    @RequestMapping("/asusprinter")
    public String asusController() {
        return printer1.printer("@PostConstruct example");
    }

    @RequestMapping("/epsonprinter")
    public String epsonController() {
        return printer2.printer("afterPropertiesSet example");
    }
}
