package com.kodilla.testing.forum.statistics;

public class CalculatedStatistics {
    Statistics statistics;
    int numberOfUsers;
    int numberOfPosts;
    int numberOfComments;
    double averageNumOfPostsPerUser;
    double averageNumOfCommentsPerUser;
    double averageNumOfCommentsPerPost;

    public CalculatedStatistics(Statistics statistics) {
        this.statistics = statistics;
    }

    public int getNumberOfUsers() {
        return numberOfUsers;
    }

    public int getNumberOfPosts() {
        return numberOfPosts;
    }

    public int getNumberOfComments() {
        return numberOfComments;
    }

    public double getAverageNumOfPostsPerUser() {
        return averageNumOfPostsPerUser;
    }

    public double getAverageNumOfCommentsPerUser() {
        return averageNumOfCommentsPerUser;
    }

    public double getAverageNumOfCommentsPerPost() {
        return averageNumOfCommentsPerPost;
    }

    public void calculateAdvStatistics(Statistics statistics) {

        this.numberOfUsers = statistics.usersNames().size();
        this.numberOfPosts = statistics.postsCount();
        this.numberOfComments = statistics.commentsCount();

        if (numberOfUsers != 0) {
            this.averageNumOfPostsPerUser = numberOfPosts / numberOfUsers;
        } else {
            this.averageNumOfPostsPerUser = 0;
        }

        if (numberOfUsers != 0) {
            this.averageNumOfCommentsPerUser = numberOfComments / numberOfUsers;
        } else {
            this.averageNumOfCommentsPerUser = 0;
        }

        if (numberOfPosts != 0) {
            this.averageNumOfCommentsPerPost = numberOfComments / numberOfPosts;
        } else {
            this.averageNumOfCommentsPerPost = 0;
        }
    }

    public void showStatistics() {
        System.out.println(numberOfUsers);
        System.out.println(numberOfPosts);
        System.out.println(numberOfComments);
        System.out.println(averageNumOfPostsPerUser);
        System.out.println(averageNumOfCommentsPerUser);
        System.out.println(averageNumOfCommentsPerPost);

    }
}

