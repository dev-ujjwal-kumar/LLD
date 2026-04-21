package org.example.solid_principles.ocp.good_code;

public class CreaditCard implements PaymentMethod {
    // Implementing the processPayment method for Credit Card payment
    @Override
    public void pay(Double amount) {
        //Business logic for processing credit card payment
        System.out.println("Processing Credit Card payment of amount: " + amount);
    }
    
}
