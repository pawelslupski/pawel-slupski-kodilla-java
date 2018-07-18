package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BoardTestSuite {
    @Test
    public void testAddTask() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        //When
        board.addTaskToToDoList("Grocery shopping");
        board.addTaskToInProgressList("Clean my room");
        board.addTaskToDoneList("Washing the car");
        //Then
        Assert.assertEquals("Grocery shopping", board.getTasksOfToDoList());
        Assert.assertEquals("Clean my room", board.getTasksOfInProgressList());
        Assert.assertEquals("Washing the car", board.getTasksOfDoneList());
    }
}
