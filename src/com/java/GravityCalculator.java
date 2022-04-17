package com.java;

//x (t) = (t ^ 2) * a * 0.5 + v0 * t + x0

public class GravityCalculator {
    static final double GRAVITY_CONSTANT = 9.81;

    double fallingTime = 0;
    int initialPosition = 0;
    int initialVelocity = 0;


    public GravityCalculator(double fallingTime, int initialPosition, int initialVelocity) {
        this.fallingTime = fallingTime;
        this.initialPosition = initialPosition;
        this.initialVelocity = initialVelocity;
    }

    public void calculate() {
        //4. Convert the received initialPosition and initialVelocity parameters to type double.
        // Convert the fallingTime parameter to type int. (0.5p.)
        double fallingTime_double = fallingTime;
        int initialPosition_int = initialPosition;
        int initialVelocity_int = initialVelocity;

        double finalPosition = (Math.pow(fallingTime_double, 2))
                * (GRAVITY_CONSTANT * 0.5)
                + (initialVelocity_int * fallingTime_double)
                + initialPosition_int;

        System.out.println("Position in " + fallingTime + " seconds:" + finalPosition);
    }
}
