package com.java;

public class Marathon {

    String[] names = {"Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex",
            "Emma", "John", "James", "Jane", "Emily", "Daniel", "Neda", "Aaron", "Kate"};

    int[] times = {341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299,
            343, 317, 265};

    void printResults() {
        int sizeN = names.length;
        int sizeT = times.length;
        if (sizeN != sizeT) {
            System.out.println("Error");
            return;
        }
        for (int i = 0; i < sizeN; i++) {
            System.out.print(names[i] + " " + times[i] + "\n");
        }
    }

}
