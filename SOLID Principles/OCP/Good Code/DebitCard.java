package SOLID Principles.OCP.Good Code;

public class DebitCard implements PaymentMethod {
    // Implementing the processPayment method for Debit Card payment
    @Override
    public void pay(Double amount) {
        //Business logic for processing debit card payment
        System.out.println("Processing Debit Card payment of amount: " + amount);
    }
}
