package com.kodilla.testing.forum.statistics;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CalculatedStatisticsTestSuite {
    @Test
    public void testCalculateAdvStatisticsWithMockInCaseOfZeroPosts() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);

        int mockPostsCount = 0;
        when(statisticsMock.postsCount()).thenReturn(mockPostsCount);

        CalculatedStatistics calculatedStatistics = new CalculatedStatistics(statisticsMock);
        calculatedStatistics.calculateAdvStatistics(statisticsMock);

        //When
        int quantityOfPosts = calculatedStatistics.getNumberOfPosts();

        //Then
        Assert.assertEquals(0, quantityOfPosts);
    }

    @Test
    public void testCalculateAdvStatisticsWithMockInCaseOfThousandPosts() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);

        int mockPostsCount = 1000;
        when(statisticsMock.postsCount()).thenReturn(mockPostsCount);

        CalculatedStatistics calculatedStatistics = new CalculatedStatistics(statisticsMock);
        calculatedStatistics.calculateAdvStatistics(statisticsMock);

        //When
        int quantityOfPosts = calculatedStatistics.getNumberOfPosts();

        //Then
        Assert.assertEquals(1000, quantityOfPosts);
    }

    @Test
    public void testCalculateAdvStatisticsWithMockInCaseOfZeroComments() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);

        int mockCommentsCount = 0;
        when(statisticsMock.commentsCount()).thenReturn(mockCommentsCount);

        CalculatedStatistics calculatedStatistics = new CalculatedStatistics(statisticsMock);
        calculatedStatistics.calculateAdvStatistics(statisticsMock);

        //When
        int quantityOfComments = calculatedStatistics.getNumberOfPosts();

        //Then
        Assert.assertEquals(0, quantityOfComments);
    }

    @Test
    public void testCalculateAdvStatisticsWithMockInCaseOfLessCommentsThanPosts() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        int mockCommentsCount = 10;
        int mockPostsCount = 1000;

        when(statisticsMock.commentsCount()).thenReturn(mockCommentsCount);
        when(statisticsMock.postsCount()).thenReturn(mockPostsCount);

        CalculatedStatistics calculatedStatistics = new CalculatedStatistics(statisticsMock);
        calculatedStatistics.calculateAdvStatistics(statisticsMock);

        //When
        int quantityOfComments = calculatedStatistics.getNumberOfComments();
        int quantityOfPosts = calculatedStatistics.getNumberOfPosts();

        //Then
        Assert.assertTrue(quantityOfComments < quantityOfPosts);
    }

    @Test
    public void testCalculateAdvStatisticsWithMockInCaseOfMoreCommentsThanPosts() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        int mockCommentsCount = 1000;
        int mockPostsCount = 10;

        when(statisticsMock.commentsCount()).thenReturn(mockCommentsCount);
        when(statisticsMock.postsCount()).thenReturn(mockPostsCount);

        CalculatedStatistics calculatedStatistics = new CalculatedStatistics(statisticsMock);
        calculatedStatistics.calculateAdvStatistics(statisticsMock);

        //When
        int quantityOfComments = calculatedStatistics.getNumberOfComments();
        int quantityOfPosts = calculatedStatistics.getNumberOfPosts();

        //Then
        Assert.assertTrue(quantityOfComments > quantityOfPosts);
    }

    @Test
    public void testCalculateAdvStatisticsWithMockInCaseOfZeroUsers() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);

        List<String> mockUsersNames = new ArrayList<String>();
        when(statisticsMock.usersNames()).thenReturn(mockUsersNames);

        CalculatedStatistics calculatedStatistics = new CalculatedStatistics(statisticsMock);
        calculatedStatistics.calculateAdvStatistics(statisticsMock);

        //When
        int quantityOfUsers = calculatedStatistics.getNumberOfUsers();

        //Then
        Assert.assertEquals(0, quantityOfUsers);
    }

    @Test
    public void testCalculateAdvStatisticsWithMockInCaseOfHundredUsers() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);

        List<String> mockUsersNames = new ArrayList<String>();
        Random theGenerator = new Random();
        for (int n = 0; n < 100; n++) {
            mockUsersNames.add(Integer.toString(theGenerator.nextInt(100)));
        }
        when(statisticsMock.usersNames()).thenReturn(mockUsersNames);

        CalculatedStatistics calculatedStatistics = new CalculatedStatistics(statisticsMock);
        calculatedStatistics.calculateAdvStatistics(statisticsMock);

        //When
        int quantityOfUsers = calculatedStatistics.getNumberOfUsers();

        //Then
        Assert.assertEquals(100, quantityOfUsers);

    }
}
