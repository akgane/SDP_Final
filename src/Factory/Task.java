package Factory;

import Observer.Observer;

import java.util.*;

public abstract class Task {
    private String title;
    private String status;
    private List<Observer> observers = new ArrayList<Observer>();

    public Task(String title) {
        this.title = title;
        this.status = "Created";
    }

    public void setStatus(String status) {
        this.status = status;
        notifyObservers();
    }

    public String getTitle(){
        return title;
    }

    public String getStatus(){
        return status;
    }

    public void addObserver(Observer observer){
        observers.add(observer);
    }

    public void removeObserver(Observer observer){
        observers.remove(observer);
    }

    private void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }

    public abstract void execute();
}
