package Beheavioural DP.Observer Pattern.With BD;

public class MobileDevice implements Observer {
    @Override
    public void update(float temperature) {
        System.out.println("Mobile Device: Temperature updated to " + temperature);
    }
}
