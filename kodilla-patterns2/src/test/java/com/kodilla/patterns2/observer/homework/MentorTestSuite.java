package com.kodilla.patterns2.observer.homework;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MentorTestSuite {
    @Test
    public void testUpdate() {
        //Given
    TasksOfParticipant tasksOfGregStewart = new TasksOfParticipant("Greg Stewart");
    TasksOfParticipant tasksOfMichaelJuniorSmith = new TasksOfParticipant("Michael Junior Smith");
    TasksOfParticipant tasksOfZbigniewLolek = new TasksOfParticipant("Zbigniew Lolek");
    TasksOfParticipant tasksOfLauraKidney = new TasksOfParticipant("Laura Kidney");
    Mentor isaacNewton = new Mentor("Isaac Newton");
    Mentor yodaMaster = new Mentor("Yoda Master");
    tasksOfGregStewart.registerObserver(isaacNewton);
    tasksOfLauraKidney.registerObserver(isaacNewton);
    tasksOfGregStewart.registerObserver(yodaMaster);
    tasksOfZbigniewLolek.registerObserver(yodaMaster);
    tasksOfMichaelJuniorSmith.registerObserver(yodaMaster);
    //When
    tasksOfGregStewart.add("Simple Task based on ArrayDequeue");
    tasksOfGregStewart.add("The task based on \'Observer\' design pattern");
    tasksOfLauraKidney.add("Iterator");
    tasksOfZbigniewLolek.add("Books on stack");
    tasksOfMichaelJuniorSmith.add("Paper, rock, scissors game");
    tasksOfMichaelJuniorSmith.add("Sudoku game solver");
    tasksOfMichaelJuniorSmith.add("Iterator");
    //Then
     assertEquals(3, isaacNewton.getUpdateCount());
     assertEquals(6, yodaMaster.getUpdateCount());
    }
}
