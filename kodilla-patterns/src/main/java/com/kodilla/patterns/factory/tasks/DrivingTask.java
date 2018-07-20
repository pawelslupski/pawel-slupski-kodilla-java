package com.kodilla.patterns.factory.tasks;

import java.time.LocalDate;

public class DrivingTask implements Task {
    final String taskName;
    final String where;
    final String using;
    final LocalDate scheduled;

    public DrivingTask(String taskName, String where, String using, LocalDate scheduled) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
        this.scheduled = scheduled;
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public void executeTask() {
        System.out.println("The delivery is in progress...");
    }

    @Override
    public boolean isTaskExecuted() {
        if(scheduled.isBefore(LocalDate.now())) {
            System.out.println("That job is done");
            return true;
        } else {
            System.out.println("Job still has to be done!");
            return false;
        }
    }

}
