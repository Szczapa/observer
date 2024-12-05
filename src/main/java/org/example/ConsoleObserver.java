package org.example;


public class ConsoleObserver implements IObserver {
    @Override
    public void update(String message){
        System.out.println("Console Message :" + message);
    }
}
