package org.example.creational_dp.factory.with;

public class Car implements Transport {
    @Override
    public void deliver(){
        // Bussiness logic
        System.out.println("Delivery By Car");
    }
}
