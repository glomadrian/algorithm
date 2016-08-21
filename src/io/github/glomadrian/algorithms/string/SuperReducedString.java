package io.github.glomadrian.algorithms.string;/*
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
 * https://www.hackerrank.com/challenges/reduced-string
 */


public class SuperReducedString {

    private static final String EMPTY = "Empty String";

    public String execute(String value) {
        String resultValue;
        ComputedResult computedResult = computeDelete(value);
        if (computedResult.pairsDeleted) {
            resultValue =  execute(computedResult.result);
        } else {
            resultValue = computedResult.result;
        }
        if(resultValue.isEmpty()){
            return EMPTY;
        } else {
            return resultValue;
        }
    }

    private ComputedResult computeDelete(String value) {
        ComputedResult computedResult = new ComputedResult();

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < value.length(); i++) {
            if (i == value.length() - 1) {
                result.append(value.charAt(i));
                break;
            }
            char actual = value.charAt(i);
            char next = value.charAt(i + 1);
            if (actual == next) {
                computedResult.pairsDeleted = true;
                i++;
            } else {
                result.append(actual);
            }
        }
        computedResult.result = result.toString();
        return computedResult;
    }

    private class ComputedResult {
        String result;
        boolean pairsDeleted = false;
    }
}
