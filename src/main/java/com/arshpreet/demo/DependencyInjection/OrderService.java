package com.arshpreet.demo.DependencyInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OrderService {
//    @Autowired //Field Injection
    PaymentService paymentService;

    //Constructor Injection(if only one cntructor no need to write autwired)
    //If mulptiple constructors then specify wiring through one is done
    OrderService(PaymentService paymentService){
        this.paymentService = paymentService;
    }

    //Setter Method
    public void setPaymentService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public void placeOrder(){
        paymentService.payment();
        System.out.println("Order Placed");
    }
}
