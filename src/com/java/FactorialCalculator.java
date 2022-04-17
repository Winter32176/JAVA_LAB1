package com.java;

public class FactorialCalculator {

    long factorial = 0;

    public FactorialCalculator(int factorial) {
        this.factorial = factorial;
    }

    public long factorial_calculations() {
        long val = factorial;
        for (long i = factorial - 1; i > 0; i--) {
            val = val * i;
        }
        return val;
    }


    public long calculate_factorial_recursive() {
        return factorial_calculations_recursive(factorial);
    }

    public long factorial_calculations_recursive(long factorial) {
        if (factorial == 0) {
            return 1;
        }
        return factorial * factorial_calculations_recursive(factorial - 1);
    }
}

