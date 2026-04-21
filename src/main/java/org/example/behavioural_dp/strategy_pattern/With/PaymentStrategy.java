package org.example.behavioural_dp.strategy_pattern.With;

interface PaymentStrategy {
    void processPayment();
}

// concerte strategy
class CreditCard implements PaymentStrategy{
    @Override
    public void processPayment(){
        System.out.println("Processing Payment through: Credit Card");
    }
}

class DebitCard implements PaymentStrategy{
    @Override
    public void processPayment(){
        System.out.println("Processing Payment through: Debit Card");
    }
}

class UPI implements PaymentStrategy{
    @Override
    public void processPayment(){
        System.out.println("Processing Payment through: UPI");
    }
}

class paymentService{
    private PaymentStrategy paymentStrategy;

    public void setPaymentStrategy(PaymentStrategy paymentStrategy){
        this.paymentStrategy = paymentStrategy;
    }

    public void pay(){
        paymentStrategy.processPayment(); // Ploymorphic beheaviour
    }
}

class main{
    public static void main(String[] args) {
        UPI upi = new UPI();
        PaymentStrategy paymentStrategy = new PaymentStrategy() {
            @Override
            public void processPayment() {

            }
        }
        paymentStrategy.se
    }
}