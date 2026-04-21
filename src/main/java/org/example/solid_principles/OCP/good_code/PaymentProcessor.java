package org.example.solid_principles.ocp.good_code;


// It will call pay method whatever payment method is passed and 
// if we want to add new payment method in future we just have to 
// create new class and implement PaymentMethod interface and implement
//  pay method and no need to change existing code. so it follows OCP also.

public class PaymentProcessor {
    public void processPayment(org.example.solid_principles.ocp.good_code.PaymentMethod paymentMethod, Double amount) { // Run time polymorphism
        paymentMethod.pay(amount);
    }
}
