package com.kodilla.spring.portfolio;

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
        //When & Then
        board.addTaskToToDoList("Grocery shopping");
        board.addTaskToInProgressList("Clean my room");
        board.addTaskToDoneList("Washing the car");

        board.showTasksOfToDoList();
        board.showTasksOfInProgressList();
        board.showTasksOfDoneList();
    }
}
