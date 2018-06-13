package com.github.glomadrian.common;
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
