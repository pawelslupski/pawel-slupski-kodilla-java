package com.kodilla.testing.forum.statistics;

public class CalculatedStatistics {
    Statistics statistics;
    int numberOfUsers;
    double numberOfPosts;
    double numberOfComments;
    double averageNumofPostsPerUser;
    double averageNumofCommentsPerUser;
    double averageNumofCommentsPerPost;

    public CalculatedStatistics(Statistics statistics) {
        this.statistics = statistics;
    }

    public void calculateAdvStatistics(Statistics statistics) {

        this.numberOfUsers = statistics.usersNames().size();
        this.numberOfPosts = statistics.postsCount();
        this.numberOfComments = statistics.commentsCount();

        this.averageNumofPostsPerUser = numberOfPosts / numberOfUsers;
        this.averageNumofCommentsPerUser = numberOfComments / numberOfUsers;
        this.averageNumofCommentsPerPost = numberOfComments / numberOfPosts;
    }
}

