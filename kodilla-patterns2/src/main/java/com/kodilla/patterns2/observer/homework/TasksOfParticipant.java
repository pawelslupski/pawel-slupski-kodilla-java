package com.kodilla.patterns2.observer.homework;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public class TasksOfParticipant implements Observable {
    private final String name;
    private final ArrayDeque<String> tasks;
    private final List<Observer> observers;

    public TasksOfParticipant(String name) {
        this.name = name;
        this.tasks = new ArrayDeque<>();
        this.observers = new ArrayList<>();
    }

    public void add(String task) {
        tasks.offer(task);
        notifyObserver();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObserver() {
       for(Observer observer: observers) {
            observer.update(this);
       }
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public String getName() {
        return name;
    }

    public ArrayDeque<String> getTasks() {
        return tasks;
    }
}
