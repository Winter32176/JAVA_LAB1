package com.java;

public class OneDimensionalArray {

    void createRandomArray(int size) {
        double[][] array = new double[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                array[i][j] = Math.random() * 100; // not said to include 0 and 100
            }
        }
        arrOutput(array, size);
        averageVal(array, size);
        largestSmallestVal(array, size);
    }

    void arrOutput(double[][] array, int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                double val = Math.round(array[i][j] * 1000.0) / 1000.0;
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    void averageVal(double[][] array, int size) {
        double buf = 0;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                buf += array[i][j];
            }
        }
        double averageVal = buf / (Math.pow(size, 2));
        System.out.println("Average value is " + averageVal);
    }

    void largestSmallestVal(double[][] array, int size) {
        double largest = array[0][0];
        double smallest = array[0][0];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (array[i][j] > largest) {
                    largest = array[i][j];
                }
                if (array[i][j] < smallest) {
                    smallest = array[i][j];
                }
            }
        }
        System.out.println("Smallest: " + smallest);
        System.out.println("Largest: " + largest);
    }

}
