package io.github.glomadrian.datastructures.array;
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
 */

/**
 * Left Rotation
 * Difficulty: Easy
 * https://www.hackerrank.com/challenges/array-left-rotation
 */
public class LeftRotation {

    public int[] execute(int[] numbers, int rotations) {
        int[] results = new int[numbers.length];
        int position = calculateStartPosition(rotations, numbers.length);
        for (int i = 0; i < numbers.length; i++, position++) {
            if(position == numbers.length){
                position = 0;
            }
            results[i] = numbers[position];
        }
        return results;
    }

    private int calculateStartPosition(int rotations, int size) {
        int result = rotations;
        if(rotations > size){
            result = rotations - size;
        }
        return result;
    }
}
