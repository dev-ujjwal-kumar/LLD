package Beheavioural DP.Observer Pattern.With BD;

//Concerete classes for subject
public class WeatherStation implements Subject{
    private float temperature;
    private List<Observer> observerList;

    public weatherStation(){
        observerList = new ArrayList<>();
    }

    @Override
    Public void addObserver(Observer o) {
        //code to add observer
        observerList.add(o);
;    }

    @Override   
    Public void removeObserver(Observer o) {
        //code to remove observer
        observerList.remove(o);
    }
    
    public void setTemperature(float temp){
        this.temperature = temp;
        notifyObservers();
    } 
    
    @Override
    Public void notifyObservers() {
        //code to notify observers
        for(Observer obs : observerList){
            obs.update(temperature); // Run time polymorphism
        }
    }
    
}
