package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;
public class TestingMain {
    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("ForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("ForumUser")){
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        Calculator calculator = new Calculator(4,5);


        if (calculator.add().equals(9)){
            System.out.println("Adding correct");
        } else {
            System.out.println("Adding incorrect");
        }

        if (calculator.subtract().equals(-1)){
            System.out.println("Subtracting correct");
        } else {
            System.out.println("Subtracting incorrect");
        }


    }
}
