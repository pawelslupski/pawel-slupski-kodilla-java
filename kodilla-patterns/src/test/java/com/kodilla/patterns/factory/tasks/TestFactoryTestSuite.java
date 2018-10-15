package com.kodilla.patterns.factory.tasks;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TestFactoryTestSuite {
    @Test
    public void testFactoryDrivingTask() {
        TaskFactory taskFactory = new TaskFactory();
        //Then
        Task drivingTask = taskFactory.createTask(TaskFactory.DRIVING_TASK);
        //Then
        assertEquals("Furniture Delivery", drivingTask.getTaskName());
        System.out.println(drivingTask.getTaskName());
        assertTrue(drivingTask.isTaskExecuted());
    }

    @Test
    public void testFactoryPaintingTask() {
        TaskFactory taskFactory = new TaskFactory();
        //Then
        Task paintingTask = taskFactory.createTask(TaskFactory.PAINTING_TASK);
        //Then
        assertEquals("Wall painting", paintingTask.getTaskName());
        System.out.println(paintingTask.getTaskName());
        assertTrue(paintingTask.isTaskExecuted());
    }

    @Test
    public void testFactoryShoppingTask() {
        TaskFactory taskFactory = new TaskFactory();
        //Then
        Task shoppingTask = taskFactory.createTask(TaskFactory.SHOPPING_TASK);
        //Then
        assertEquals("Grocery shopping", shoppingTask.getTaskName());
        System.out.println(shoppingTask.getTaskName());
        assertTrue(shoppingTask.isTaskExecuted());
    }
}
