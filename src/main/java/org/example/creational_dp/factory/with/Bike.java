package org.example.creational_dp.factory.with;

public class Bike implements Transport {
    @Override
    public void deliver(){
        // Bussiness logic
        System.out.println("Deliver by Bike");
    }
}
