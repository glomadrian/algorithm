package com.github.glomadrian.algorithms.sort;

public abstract class Sort {
    protected Comparable[] collection;

    public Sort(Comparable[] collection) {
        this.collection = collection;
    }

    public abstract Comparable[] sort();


    protected void exchange(Comparable[] array, int position1, int position2) {
        Comparable swap = array[position1];
        array[position1] = array[position2];
        array[position2] = swap;
    }

    protected boolean isSorted(Comparable[] a) {
        for (int i = 1; i < a.length; i++)
            if (less(a[i], a[i - 1])) return false;
        return true;
    }

    protected boolean less(Comparable item1, Comparable item2) {
        return item1.compareTo(item2) < 0;
    }

}
