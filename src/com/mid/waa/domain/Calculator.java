package com.mid.waa.domain;

import java.io.FileReader;

public class Calculator {
    private String operator;
    private int firstNumber;
    private int secondNumber;


    public int calculate(String operator, int firstNumber, int secondNumber) {
        if (operator.equals("+"))
            return firstNumber + secondNumber;
        else
            return firstNumber - secondNumber;
    }

  }
