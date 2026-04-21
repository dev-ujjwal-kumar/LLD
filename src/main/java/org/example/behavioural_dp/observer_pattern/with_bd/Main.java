package org.example.behavioural_dp.observer_pattern.with_bd;

public class Main {
    public static void main(String[] args) {
        //create a publisher
        WeatherStation weatherStation = new WeatherStation();

        //create subscribers
        MobileDevice mobileDevice = new MobileDevice();
        DisplayDevice displayDevice = new DisplayDevice();

        //Add Observers
        weatherStation.addObserver(mobileDevice);
        weatherStation.addObserver(displayDevice);

        //update the temperature
        weatherStation.setTemperature(25.5f);

        //Detach an observer
        weatherStation.removeObserver(mobileDevice);

        weatherStation.setTemperature(30.0f);
    }
}
