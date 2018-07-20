package com.kodilla.patterns.factory.tasks;

import java.time.LocalDate;

public class TaskFactory {
    public static final String DRIVING_TASK = "DRIVING TASK";
    public static final String PAINTING_TASK = "PAINTING TASK";
    public static final String SHOPPING_TASK = "SHOPPING TASK";

    public final Task createTask(final String taskClass) {
        switch (taskClass) {
            case DRIVING_TASK:
                return new DrivingTask("Furniture Delivery", "Ohio",
                        "van", LocalDate.of(2018, 7, 19));
            case PAINTING_TASK:
                return new PaintingTask("Wall painting", "salomon",
                        "wall", LocalDate.of(2018, 7, 22));
            case SHOPPING_TASK:
                return new ShoppingTask("Grocery shopping", "leek",
                        2.0, LocalDate.of(2018, 7, 15));
            default:
                return null;
        }
    }
}
