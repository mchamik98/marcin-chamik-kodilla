package com.kodilla.exception.test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SecondChallengeTest {
    @Test
    void secondChallengeTest() {

        //given
        SecondChallenge secondChallenge = new SecondChallenge();

        //when & then
        assertAll(
                () -> assertThrows(Exception.class,
                        () -> secondChallenge.probablyIWillThrowException(2.0, 1.5)),
                () -> assertThrows(Exception.class,
                        () -> secondChallenge.probablyIWillThrowException(1, 1.5)),
                () -> assertDoesNotThrow(() -> secondChallenge.probablyIWillThrowException(1, 1))
        );
    }
}
