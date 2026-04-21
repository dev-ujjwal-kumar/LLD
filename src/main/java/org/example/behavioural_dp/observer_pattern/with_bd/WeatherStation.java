package org.example.behavioural_dp.observer_pattern.with_bd;

import java.util.ArrayList;
import java.util.List;

//Concerete classes for subject
public class WeatherStation implements Subject{
    private float temperature;
    private List<Observer> observerList;

    public WeatherStation(){
        observerList = new ArrayList<>();
    }

    @Override
    public void addObserver(Observer o) {
        //code to add observer
        observerList.add(o);
    }

    @Override   
    public void removeObserver(Observer o) {
        //code to remove observer
        observerList.remove(o);
    }
    
    public void setTemperature(float temp){
        this.temperature = temp;
        notifyObservers();
    } 
    
    @Override
    public void notifyObservers() {
        //code to notify observers
        for(Observer obs : observerList){
            obs.update(temperature); // Run time polymorphism
        }
    }
    
}
