package Beheaviural DP.Observer Pattern.Without BD;

public class WeatherStation {
    Private float temperature;
    private DisplayDevice displayDevice; // Can be multiple display devices

    public WeatherStation(DisplayDevice displayDevice) {
        this.displayDevice = displayDevice;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
        notifyDisplayDevice();
    }

    // Method to notify the display device about the temperature change
    public void notifyDisplayDevice() {
        displayDevice.showTemperature(temperature);
    }
