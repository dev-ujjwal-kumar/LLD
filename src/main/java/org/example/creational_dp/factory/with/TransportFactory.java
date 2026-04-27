package org.example.creational_dp.factory.with;

import org.example.creational_dp.factory.without.Bike;
import org.example.creational_dp.factory.without.Car;
import org.example.creational_dp.factory.without.Transport;

public class TransportFactory {
    public static Transport createTransport(String type){
        switch (type.toLowerCase()){
            case "car":
                return new Car();
            case "bike":
                return new Bike();
            default:
                throw new UnsupportedOperationException("Unsupported type");


        }
    }
}
