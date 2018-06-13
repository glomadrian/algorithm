package com.github.glomadrian.algorithms.string;/*
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
 * Return true if the string is a palindrome
 */
public class Palindrome {

    boolean execute(String value) {
        char[] chars = value.toCharArray();
        if(value.length() <= 1) {
            return false;
        }
        for (int i = 0; i < chars.length; i++) {
            int pointerA = i;
            int pointerB = chars.length - 1 - i;
            if (pointerA < pointerB) {
                char charA = chars[pointerA];
                char charB = chars[pointerB];
                if (charA != charB) {
                    return false;
                }
            } else {
                break;
            }
        }

        return true;
    }
}
