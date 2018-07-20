package com.kodilla.patterns.factory.tasks;

import java.time.LocalDate;

public class ShoppingTask implements Task {
    final String taskName;
    final String whatToBuy;
    final double quantity;
    LocalDate scheduled;


    public ShoppingTask(String taskName, String whatToBuy, double quantity, LocalDate scheduled) {
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
        this.scheduled = scheduled;
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public void executeTask() {
        System.out.println("Buying leeks is in progress:)...");
    }

    @Override
    public boolean isTaskExecuted() {
        if(scheduled.isBefore(LocalDate.now())) {
            System.out.println("That job is done");
            return true;
        } else {
            System.out.println("Please remember to that job!");
            return false;
        }
    }

}
