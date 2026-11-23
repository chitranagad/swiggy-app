package com.example.swigggy_app.controller;

import com.example.swigggy_app.dto.OrderResponseDTO;
import com.example.swigggy_app.service.SwiggyAppService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/swiggy")
public class SwiggyAppController {

    private final SwiggyAppService swiggyAppService;

    public SwiggyAppController(SwiggyAppService swiggyAppService){
        this.swiggyAppService = swiggyAppService;
    }

    @GetMapping("/home")
    public String greetingMessage(){
        return swiggyAppService.greeting();
    }

    @GetMapping("/{orderId}")
    public OrderResponseDTO chechOrderStatus(@PathVariable("orderId") String orderId){
        return swiggyAppService.checkOrderStatus(orderId);
    }
}
