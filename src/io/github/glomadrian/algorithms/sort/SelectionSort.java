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

public class SelectionSort extends Sort {

    public SelectionSort(Comparable[] collection) {
        super(collection);
    }

    @Override
    public Comparable[] sort() {
        int length = collection.length;
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                if (less(collection[j], collection[i])) {
                    exchange(collection, j, i);
                }
            }
        }
        return collection;
    }


}
