package org.example.solid_principles.srp.good_code;

public class Invoice {
    private Double amount;

    public Invoice(Double amount) {
        this.amount = amount;
    }

    // Additional Functionality
    public Double generteInvoice() {
        System.out.println("Generating Invoice for amount: " + amount);
        return amount;
    }
    
}
