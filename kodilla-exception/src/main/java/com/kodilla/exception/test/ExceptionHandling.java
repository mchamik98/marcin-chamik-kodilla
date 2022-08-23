package com.kodilla.exception.test;

public class ExceptionHandling {
    public static void main (String[] args) {
        SecondChallenge secondChallenge = new SecondChallenge();

        try {
            secondChallenge.probablyIWillThrowException(7, 3);
        } catch (Exception e) {
            System.out.println("Numbers are wrong.");
        } finally {
            System.out.println("End.");
        }
    }
}