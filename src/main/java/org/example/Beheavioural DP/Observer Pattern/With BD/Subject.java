package Beheavioural DP.Observer Pattern.With BD;

// Instead of Abstract class we had a interface for Observer and Subject.
//  This is because we can have multiple inheritance with interfaces but not with abstract classes.
//  Also, we can have default methods in interfaces which can be overridden by the implementing classes.
public interface Subject {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}
