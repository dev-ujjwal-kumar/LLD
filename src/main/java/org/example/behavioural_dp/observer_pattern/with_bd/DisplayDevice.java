package org.example.behavioural_dp.observer_pattern.with_bd;

public class DisplayDevice implements Observer {
    @Override
    public void update(float temperature) {
        System.out.println("Display Device: Temperature updated to " + temperature);
    }
}
