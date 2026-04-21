package org.example.behavioural_dp.strategy_pattern.Without;

public class payment {
    public static void main(String[] args) {
        PaymentProcessor paymentProcessor = new PaymentProcessor();
        paymentProcessor.processPayment("Credit Card");
    }
}
