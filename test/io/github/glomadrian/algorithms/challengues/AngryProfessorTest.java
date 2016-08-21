package io.github.glomadrian.algorithms.challengues;

import org.junit.Test;

import static org.junit.Assert.*;

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

public class AngryProfessorTest {

    @Test
    public void givenATestCaseCanceledTheResultShouldBeYes() {
        int cancellationThreshold = 3;
        int[] times = new int[]{-1, -3, 4, 2};
        AngryProfessor angryProfessor = givenAAngryProfessor();

        boolean canceled = angryProfessor.execute(cancellationThreshold, times);

        assertTrue(canceled);
    }

    @Test
    public void givenATestCaseNoCanceledTheResultShouldBeYes() {
        int cancellationThreshold = 2;
        int[] times = new int[]{0, -1, 2, 1};
        AngryProfessor angryProfessor = givenAAngryProfessor();

        boolean canceled = angryProfessor.execute(cancellationThreshold, times);

        assertFalse(canceled);
    }

    private AngryProfessor givenAAngryProfessor() {
        return new AngryProfessor();
    }

}