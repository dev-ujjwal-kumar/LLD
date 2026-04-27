package org.example.creational_dp.factory.without;

public class Bike implements Transport{
    @Override
    public void deliver(){
        // Bussiness logic
        System.out.println("Deliver by Bike");
    }
}
