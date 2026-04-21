package org.example.behavioural_dp.observer_pattern.with_bd;

public class MobileDevice implements Observer {
    @Override
    public void update(float temperature) {
        System.out.println("Mobile Device: Temperature updated to " + temperature);
    }
}
