package io.github.glomadrian.algorithms.challengues;

/**
 * https://www.hackerrank.com/challenges/circular-array-rotation
 * @author Adrián García Lomas
 */
public class CircularArrayRotation {

    private int[] numbers;
    private int[] rotatedNumbers;
    private int rotations;


    public CircularArrayRotation(int[] numbers, int rotations) {
        this.numbers = numbers;
        this.rotations = rotations;
    }

    public void performRotation() {
        rotatedNumbers = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            int newPosition = calculateNewPosition(i);
            rotatedNumbers[newPosition] = numbers[i];
        }
    }

    private int calculateNewPosition(int oldPosition) {
       return  (oldPosition + rotations) % numbers.length;
    }

    public int queryForNewPosition(int newPosition) {
        return rotatedNumbers[newPosition];
    }

}