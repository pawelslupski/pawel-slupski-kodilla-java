package com.kodilla.good.patterns.challenges;

public class MailService implements InformationService {
    public void inform(User user) {
        System.out.println("Email confirming the placed order is being sent to " + user.getName() + " " +
        user.getSurname() + ".");
    }

}
