package org.example.solid_principles.ocp.good_code;

public class UPI implements PaymentMethod {
    // Implementing the processPayment method for UPI payment
    @Override
    public void pay(Double amount) {
        //Business logic for processing UPI payment
        System.out.println("Processing UPI payment of amount: " + amount);
    }
    
}
