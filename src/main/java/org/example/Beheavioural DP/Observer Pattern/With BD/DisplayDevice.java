package Beheavioural DP.Observer Pattern.With BD;

public class DisplayDevice implements Observer {
    @Override
    public void update(float temperature) {
        System.out.println("Display Device: Temperature updated to " + temperature);
    }
}
