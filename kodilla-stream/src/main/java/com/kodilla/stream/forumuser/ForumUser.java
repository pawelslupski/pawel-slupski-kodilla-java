package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {
    private final String userName;
    private final char sex;
    private final LocalDate dateOfBirth;
    private final int postQuantity;
    private final int idNumber;

    public ForumUser(final String userName, final char sex, final int yearOfBirth, final int monthOfBirth,
                     final int dayOfBirth, final int postQuantity, final int idNumber) {
        this.userName = userName;
        this.sex = sex;
        this.dateOfBirth = LocalDate.of(yearOfBirth, monthOfBirth, dayOfBirth);
        this.postQuantity = postQuantity;
        this.idNumber = idNumber;
    }

    public String getUserName() {
        return userName;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public int getPostQuantity() {
        return postQuantity;
    }

    public int getIdNumber() {
        return idNumber;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "userName='" + userName + '\'' +
                ", sex=" + sex +
                ", dateOfBirth=" + dateOfBirth +
                ", postQuantity=" + postQuantity +
                ", idNumber=" + idNumber +
                '}';
    }
}
