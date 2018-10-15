package com.kodilla.testing.collection;

import org.junit.*;
import java.util.ArrayList;


public class CollectionTestSuite {
    @Before
    public void before() {
        System.out.println("Test Case: begin");
    }
    @After
    public void after() {
        System.out.println("Test Case: end");
    }
    @BeforeClass
    public static void beforeClass() {
        System.out.println("Test Suite: begin");
    }
    @AfterClass
    public static void afterClass() {
        System.out.println("Test Suite: end");
    }
    @Test
    public void testOddNumbersExterminatorEmptyList() {
        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        ArrayList<Integer> emptyArrayList = new ArrayList<Integer>();
        //When
        ArrayList<Integer> resultEmptyList = oddNumbersExterminator.exterminate(emptyArrayList);
        System.out.println("Testing " + emptyArrayList);
        System.out.println("Testing " + resultEmptyList);
        System.out.println(resultEmptyList + "is empty as it should:)");
        //Then
        Assert.assertEquals(resultEmptyList, emptyArrayList);
        }
    @Test
    public void testOddNumbersExterminatorNormalList() {
        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        ArrayList<Integer> oddsAndEvensArrayList = new ArrayList<Integer>();
        oddsAndEvensArrayList.add(1);
        oddsAndEvensArrayList.add(2);
        oddsAndEvensArrayList.add(3);
        oddsAndEvensArrayList.add(4);
        oddsAndEvensArrayList.add(5);
        oddsAndEvensArrayList.add(6);
        oddsAndEvensArrayList.add(7);
        oddsAndEvensArrayList.add(8);
        oddsAndEvensArrayList.add(9);
        oddsAndEvensArrayList.add(10);
        ArrayList<Integer> oddsArrayList = new ArrayList<Integer>();
        oddsArrayList.add(2);
        oddsArrayList.add(4);
        oddsArrayList.add(6);
        oddsArrayList.add(8);
        oddsArrayList.add(10);
        //When
        ArrayList<Integer> resultOddsAndEvensArrayList = oddNumbersExterminator.exterminate(oddsAndEvensArrayList);
        System.out.println("Testing " + oddsAndEvensArrayList);
        System.out.println("Testing " + oddsArrayList);
        System.out.println("Testing " + resultOddsAndEvensArrayList);
        //Then
        Assert.assertEquals(oddsArrayList, resultOddsAndEvensArrayList);
    }
}
