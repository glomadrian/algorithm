package io.github.glomadrian.algorithms.challengues;
/*
 * Copyright (C) 2016 Adrián García Lomas.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

/**
 * https://www.hackerrank.com/challenges/circular-array-rotation
 *
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