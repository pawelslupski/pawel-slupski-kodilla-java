package com.kodilla.patterns.factory.tasks;

import java.time.LocalDate;

public class PaintingTask implements Task {
    final String taskName;
    final String color;
    final String whatToPaint;
    final LocalDate scheduled;

    public PaintingTask(String taskName, String color, String whatToPaint, LocalDate scheduled) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
        this.scheduled = scheduled;
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public void executeTask() {
        System.out.println("Painting wall is in progress...");
    }

    @Override
    public boolean isTaskExecuted() {
        if(scheduled.isBefore(LocalDate.now())) {
            System.out.println("That job is done");
            return true;
        } else {
            System.out.println("Job is not finished yet!");
            return false;
        }
    }

}
