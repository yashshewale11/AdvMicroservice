package com.csi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class FallBackController {
    @GetMapping("/customerFallBack")
    public String customerFallBack(){
        return "Customer Service is down please wait!!!!";

    }
    @GetMapping("/productfallback")
    public String productFallBack(){
        return"Product service is down please wait!!!";
    }

    @GetMapping("/orderfallback")
    public String orderFallBack(){
        return"Order Service is down please wait!!!";
    }
}
