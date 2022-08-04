package com.kodilla.testing.collection;


import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;

public class CollectionTestSuite {

    @BeforeEach
    public void before(){
        System.out.println("Test case: begin");
    }

    @AfterEach
    public void after() {
        System.out.println("Test Case: end");
    }

    @BeforeAll
    public static void beforeAll() {
        System.out.println("Test Suite: begin");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("Test Suite: end");
    }
    @DisplayName("OddNumberExterminatior case with empty List")
    @Test
    void testOddNumbersExterminatorEmptyList (){
       //Given
        List<Integer> testingEmptyList = new ArrayList<>();

       //When

        List<Integer> result = OddNumbersExterminator.exterminate(testingEmptyList);

        List<Integer> expected = new ArrayList<>();


       //Then

        Assertions.assertEquals(expected, result);
    }
    @DisplayName("OddNumberExterminator with integers")
    @Test
    void testOddNumbersExterminatorNormalList(){
        //Given
        List<Integer> testList = List.of(123,244,621,232,122,177,524);
        //When

        List<Integer> result = OddNumbersExterminator.exterminate(testList);

        List<Integer> expected = List.of(244,232,122,524);

        //Then

        Assertions.assertEquals(expected, result);
    }
}
