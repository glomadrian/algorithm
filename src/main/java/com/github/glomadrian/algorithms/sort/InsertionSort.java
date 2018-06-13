package com.github.glomadrian.algorithms.sort;

public class InsertionSort extends Sort {

    public InsertionSort(Comparable[] collection) {
        super(collection);
    }

    @Override
    public Comparable[] sort() {
        int length = collection.length;

        for (int i = 0; i < length; i++) {
            for (int j = i; j > 0; j--) {
                if (less(collection[j], collection[j - 1])) {
                    exchange(collection, j, j - 1);
                } else {
                    break;
                }
            }
        }
        return collection;
    }
}
