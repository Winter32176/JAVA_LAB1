package com.java;

public class Pr1 {
    public static void main(String[] args) {
        //Exercise 1
        GravityCalculator calculatorOne = new GravityCalculator(10, 5, 23);
        calculatorOne.calculate();

        System.out.println("\n");

        //Exercise 2
        FactorialCalculator calculatorTwo = new FactorialCalculator(5);
        long val = calculatorTwo.factorial_calculations();
        System.out.println(val);
        val = calculatorTwo.calculate_factorial_recursive();
        System.out.println(val);

        System.out.println("\n");

        //Exercise 3
        OneDimensionalArray task3 = new OneDimensionalArray();
        task3.createRandomArray(2);

        System.out.println("\n");

        //Exercise 4
        Marathon task4 = new Marathon();
        task4.printResults();

        System.out.println("\n");

        //Exercise 5
        TwoDimensionalArray task5 = new TwoDimensionalArray();
        task5.createRandomArray(8);

    }


}
