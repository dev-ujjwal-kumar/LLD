package Beheavioural DP.Observer Pattern.With BD;

public class Main {
    public static void main(String[] args) {
        //create a publisher
        WetherStation weatherStation = new WeatherStation();

        //create subscribers
        MobileDevice mobileDevice = new MobileDevice();
        DisplayDevice displayDevice = new DisplayDevice();

        //Add Observers
        weatherStation.addObserver(mobileDevice);
        weatherStation.addObserver(displayDevice);

        //update the temperature
        wetherStation.setTemperature(25.5f);

        //Detach an observer
        wetherStation.removeObserver(mobileDevice);

        weatherStation.setTemperature(30.0f);
    }
}
