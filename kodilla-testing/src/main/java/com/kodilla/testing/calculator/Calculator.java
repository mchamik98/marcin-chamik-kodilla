package com.kodilla.testing.calculator;

public class Calculator {
    private Integer firstNumber;
    private Integer secondNumber;

    public Calculator(Integer firstNumber, Integer secondNumber){
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    public Integer add(){
        return firstNumber + secondNumber;
    }

    public Integer subtract(){
        return firstNumber - secondNumber;
    }

}
