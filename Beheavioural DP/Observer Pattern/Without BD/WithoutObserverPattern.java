package Beheaviural DP.Observer Pattern.Without BD;

public class WithoutObserverPattern {
    public static void main(String[] args) {
        DisplayDevice device = new DisplayDevice();
        WeatherStation station = new WeatherStation(device); // Tight Coupling b/w WeatherStation and DisplayDevice

        station.setTemperature(25.5); // This will update the display device with the new temperature
        statin.setTemperature(30.0); // This will update the display device with the new temperature
    }
}
