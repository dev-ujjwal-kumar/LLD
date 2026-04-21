package org.example.behavioural_dp.strategy_pattern.Without;

public class PaymentProcessor {
    public void processPayment(String paymentType){
        if(paymentType.equals("Credit Card")){
            System.out.println("Processing Payment through : CreditCard");
        }else if(paymentType.equals("UPI")){
            System.out.println("Processing Payment through : UPI");
        }else{
            System.out.println("Unprocessed Payment");
        }
    }
}
