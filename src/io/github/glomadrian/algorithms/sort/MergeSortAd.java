package io.github.glomadrian.algorithms.sort;
/*
 * Copyright (C) 2015 Adrián García Lomas.
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

public class MergeSortAd {

    private Comparable[] left;
    private Comparable[] right;
    private Comparable[] merged;
    private int auxLength;
    int leftPosition = 0;
    int rightPosition = 0;

    public MergeSortAd(Comparable[] left, Comparable[] right) {
        this.left = left;
        this.right = right;
        this.auxLength = left.length + right.length;
        this.merged = new Comparable[auxLength];
    }

    public Comparable[] merge() {
        for (int i = 0; i < auxLength; i++) {
            if (leftPosition >= left.length) {
                rightMerge(i, right[rightPosition]);
            } else if (rightPosition >= right.length) {
                leftMerge(i, left[leftPosition]);
            } else if (isLess(left[leftPosition], right[rightPosition])) {
                leftMerge(i, left[leftPosition]);
            } else {
                rightMerge(i, right[rightPosition]);
            }
        }
        return merged;
    }

    private void leftMerge(int position, Comparable value) {
        putValueInMerge(position, value);
        leftPosition++;
    }

    private void rightMerge(int position, Comparable value) {
        putValueInMerge(position, value);
        rightPosition++;
    }

    private void putValueInMerge(int position, Comparable value) {
        merged[position] = value;
    }

    private boolean isLess(Comparable value1, Comparable value2) {
        return value1.compareTo(value2) < 0;
    }
}
