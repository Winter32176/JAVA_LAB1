package com.java;

import java.util.Random;

public class TwoDimensionalArray {

    void createRandomArray(int size) {
        int[][] array = new int[size][size];
        Random rand = new Random();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                array[i][j] = rand.nextInt(101);
            }
        }
        arrOutput(array, size);
        readOneDimensionalArray(array,size);

    }

    void arrOutput(int[][] array, int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i <size; i++) {
            colAverage(array, size,i);
        }
    }

    //Create a print function that will print to the console: Array;
    // Average values of each column and column.
    void colAverage(int[][] array, int size, int col){
        int buf=0;
        for (int i = 0; i < size; i++) {
            buf+=array[i][col];
        }
        System.out.print(buf/size + " ");
    }

    void readOneDimensionalArray(int[][] array,int size){
        int buf=0;
        for (int i = 0; i < size; i++) {
            buf+=array[0][i];
        }
        buf/=size;
    }
}
