package org.example.creational_dp.factory.with;

import org.example.creational_dp.factory.without.Transport;

public class TransportService {
    public static void main(String[] args) {
        Transport vehicle = TransportFactory.createTransport("Bike");
        vehicle.deliver();
    }
}
