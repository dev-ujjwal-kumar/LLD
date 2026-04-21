package org.example.solid_principles.ocp.bad_code;

public class PaymentProcessor {
    public void processPayment(String paymentType, double amount) {
        if (paymentType.equals("CreditCard")) {
            // Bussiness logic for processing credit card payment
            System.out.println("Processing Credit Card Payment");
        } 
        else if (paymentType.equals("DebitCard")) {
            // Bussiness logic for processing debit card payment
            System.out.println("Processing Debit Card Payment");
        } 
        else {
            throw new IllegalArgumentException("Unsupported payment type: " + paymentType);
        }
    }
}
