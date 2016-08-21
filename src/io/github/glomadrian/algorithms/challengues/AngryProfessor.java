package io.github.glomadrian.algorithms.challengues;/*
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
 * Angry professor
 * https://www.hackerrank.com/challenges/angry-professor
 * <p>
 * Difficulty: Easy
 */
public class AngryProfessor {

    public boolean execute(int cancellationThreshold, int[] times) {
        int studentsInside = 0;
        for (int i = 0; i < times.length ; i ++) {
            int time = times[i];
            if(canStudentEnterInClass(time)){
                studentsInside++;
            }
        }
        return studentsInside < cancellationThreshold;
    }

    public boolean canStudentEnterInClass(int time){
        return time <= 0;
    }
}
