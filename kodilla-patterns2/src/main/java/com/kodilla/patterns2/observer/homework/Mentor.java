package com.kodilla.patterns2.observer.homework;

public class Mentor implements Observer {
    private final String mentorName;
    private int updateCount;

    public Mentor(String mentorName) {
        this.mentorName = mentorName;
    }

    @Override
    public void update(TasksOfParticipant tasksOfParticipant) {
        System.out.println(mentorName + ": New task \"" + tasksOfParticipant.getTasks().peekLast() + "\" of "
                + tasksOfParticipant.getName() + " awaiting for review.");
        System.out.println("[total: " + tasksOfParticipant.getTasks().size() +
                (tasksOfParticipant.getTasks().size() == 1 ? " task":" tasks") + "]");
        updateCount++;
    }

    public String getMentorName() {
        return mentorName;
    }

    public int getUpdateCount() {
        return updateCount;
    }
}
