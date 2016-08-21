package io.github.glomadrian.common;

/**
 * @author Adrián García Lomas
 */
public class Pair<T1, T2> {
    private T1 pair1;
    private T2 pair2;

    public Pair(T1 pair1, T2 pair2) {
        this.pair1 = pair1;
        this.pair2 = pair2;
    }

    public T1 getPair1() {
        return pair1;
    }

    public void setPair1(T1 pair1) {
        this.pair1 = pair1;
    }

    public T2 getPair2() {
        return pair2;
    }

    public void setPair2(T2 pair2) {
        this.pair2 = pair2;
    }
}
