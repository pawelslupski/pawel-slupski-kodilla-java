package com.kodilla.spring.portfolio;

public final class Board {
    private final TaskList toDoList;
    private final TaskList inProgressList;
    private final TaskList doneList;

    public Board(TaskList toDoList, TaskList inProgressList, TaskList doneList) {
        this.toDoList = toDoList;
        this.inProgressList = inProgressList;
        this.doneList = doneList;
    }

    public void addTaskToToDoList(String task) {
        toDoList.getTasks().add(task);
    }

    public void addTaskToInProgressList(String task) {
        inProgressList.getTasks().add(task);
    }

    public void addTaskToDoneList(String task) {
        doneList.getTasks().add(task);
    }

    public void showTasksOfToDoList() {
        toDoList.getTasks().stream()
                .forEach(System.out::println);
    }

    public void showTasksOfInProgressList() {
        inProgressList.getTasks().stream()
                .forEach(System.out::println);
    }

    public void showTasksOfDoneList() {
        doneList.getTasks().stream()
                .forEach(System.out::println);
    }
}
