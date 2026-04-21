package SOLID Principles.OCP.Good Code;

public class UPI implements PaymentMethod {
    // Implementing the processPayment method for UPI payment
    @Override
    public void pay(Double amount) {
        //Business logic for processing UPI payment
        System.out.println("Processing UPI payment of amount: " + amount);
    }
    
}
