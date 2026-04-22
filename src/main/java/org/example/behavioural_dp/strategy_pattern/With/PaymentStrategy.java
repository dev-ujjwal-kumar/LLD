package org.example.behavioural_dp.strategy_pattern.With;

interface PaymentStrategy {
    void processPayment();
}

// concerte strategy
class CreditCard implements PaymentStrategy{
    // validate card details
    // simulate processing
    @Override
    public void processPayment(){
        System.out.println("Processing Payment through: Credit Card");
    }
}

class DebitCard implements PaymentStrategy{
    // validate card detals
    // Processing
    @Override
    public void processPayment(){
        System.out.println("Processing Payment through: Debit Card");
    }
}

class UPI implements PaymentStrategy{
    // Validate UPI Details
    // processing
    @Override
    public void processPayment(){
        System.out.println("Processing Payment through: UPI");
    }
}

class PaymentService{
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
        PaymentService paymentService = new PaymentService();
        paymentService.setPaymentStrategy(new CreditCard());
        paymentService.pay();
    }
}