package SOLID Principles.OCP.Good Code;
// It follows SRP also and in future suppose in future rewards points chnage from 8% to 10%. 
// so only have to make chnage in CC bussiness logic and not have to change in other payment method. so it follows OCP also
public class CreaditCard implements PaymentMethod {
    // Implementing the processPayment method for Credit Card payment
    @Override
    public void pay(Double amount) {
        //Business logic for processing credit card payment
        System.out.println("Processing Credit Card payment of amount: " + amount);
    }
    
}
