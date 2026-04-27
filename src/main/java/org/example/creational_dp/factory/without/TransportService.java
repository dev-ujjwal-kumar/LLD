package org.example.creational_dp.factory.without;

public class TransportService {
    public static void main(String[] args) {
        // Directly create objects when we want a new vehicle
        Transport car = new Car();
        Transport bike = new Bike();

        car.deliver();
        bike.deliver();
    }
}
