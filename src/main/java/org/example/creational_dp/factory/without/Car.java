package org.example.creational_dp.factory.without;

public class Car implements Transport {
    @Override
    public void deliver(){
        // Bussiness logic
        System.out.println("Delivery By Car");
    }
}
