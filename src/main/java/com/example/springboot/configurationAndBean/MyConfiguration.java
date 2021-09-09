package com.example.springboot.configurationAndBean;

import com.example.springboot.ioc.CanonPrinter;
import com.example.springboot.ioc.HpPrinter;
import com.example.springboot.ioc.Printer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// 用來加載設定使用的
@Configuration
public class MyConfiguration {

    // 會將這個return 放到spring containter 中，其名稱為方法名稱
    @Bean
    public Printer myHpPrinter(){
        return new HpPrinter();
    }

    // 這樣則將bean的名子指定為 myCannonPrinter
    @Bean("myCanonPrinter")
    public Printer myCanonPrinter(){
        return new CanonPrinter();
    }
}
