package com.backend.springboot.learn_spring_boot;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyController {
    @Autowired
    private CurrencyServiceConfiguration currencyServiceConfiguration;

//    CurrencyController(CurrencyServiceConfiguration currencyServiceConfiguration){
//        this.currencyServiceConfiguration = currencyServiceConfiguration;
//    }

    @RequestMapping("/currency")
    public CurrencyServiceConfiguration retrieveAllConfiguration(){
        return currencyServiceConfiguration;
    }
}
