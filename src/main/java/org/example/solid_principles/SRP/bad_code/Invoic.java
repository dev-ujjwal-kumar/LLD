// Example of violation of SRP (Single Responsibility Principle)
package org.example.solid_principles.srp.bad_code;
public class Invoic{
    private Double amount;

    public Invoic(Double amount) {
        this.amount = amount;
    }

    //Additional Functionl;aity
    public void generateInvoice(){
        System.out.println("Generating Invoice for amount: " + amount);
    }

    public void SaveToDataBase(){
        System.out.println("Saving Invoice to Database with amount: " + amount);
    }

    public void sendEmailNotification(){
        System.out.println("Sending Invoice email for amount: " + amount);
    }
}