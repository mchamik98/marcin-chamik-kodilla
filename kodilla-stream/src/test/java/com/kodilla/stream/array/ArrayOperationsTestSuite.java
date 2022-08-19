
package com.kodilla.stream.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayOperationsTestSuite {

    @Test
    void testGetAverage(){
        //Given
        int[] numbers = {20, 20, 20, 20, 20, 20, 20, 20, 20, 20,
                40, 40, 40, 40, 40, 40, 40, 40, 40, 40};


        //When
        double result = ArrayOperations.getAverage(numbers);

        //Then
        assertEquals(30,result);

    }
}
