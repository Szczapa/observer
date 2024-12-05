package org.example;

import java.util.ArrayList;
import java.util.List;

public class EventManager {

    private final List<IObserver> observers = new ArrayList<>();


    public void subscribe(IObserver observer) {
        observers.add(observer);
    }


    public void unsubscribe(IObserver observer) {
        observers.remove(observer);
    }


    public void notify(String message) {
        for (IObserver observer : observers) {
            observer.update(message);
        }
    }
}
