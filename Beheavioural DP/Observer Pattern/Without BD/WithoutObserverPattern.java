public class WithoutObserverPattern {
    public static void main(String[] args) {
        DisplayDevice device = new DisplayDevice();
        WeatherStation station = new WeatherStation(device); // Tight Coupling b/w WeatherStation and DisplayDevice

        station.setTemperature(25.5f); // This will update the display device with the new temperature
        station.setTemperature(30.0f); // This will update the display device with the new temperature
    }
}
