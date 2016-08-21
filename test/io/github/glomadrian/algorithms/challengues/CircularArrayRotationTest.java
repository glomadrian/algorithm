package io.github.glomadrian.algorithms.challengues;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Adrián García Lomas
 */
public class CircularArrayRotationTest {

    @Test
    public void given3NumbersInputAnd2RotationsTheResultsMustBeOk(){
        int[] numbers = {1,2,3};
        int rotations = 2;
        CircularArrayRotation circularArrayRotation = givenACiruclarArrayRotation(numbers, rotations);

        circularArrayRotation.performRotation();

        int result1 = circularArrayRotation.queryForNewPosition(0);
        int result2 = circularArrayRotation.queryForNewPosition(1);
        int result3 = circularArrayRotation.queryForNewPosition(2);

        Assert.assertEquals(2, result1);
        Assert.assertEquals(3, result2);
        Assert.assertEquals(1, result3);

    }

    private CircularArrayRotation givenACiruclarArrayRotation(int[] numbers, int rotations) {
        return new CircularArrayRotation(numbers, rotations);
    }


    @Test
    public void dummy() {
        String input = "3 2 3 6 7 8 9 6 4 3";
        int[] numbers = obtainNumbers(input);
        Assert.assertNotNull(numbers);
    }

    private static int[] obtainNumbers(String input)  {
        String[] numbersString = input.split("\\s+");
        int[] numbersArray = new int[numbersString.length];
        for (int i = 0; i < numbersArray.length; i++) {
            numbersArray[i] = Integer.parseInt(numbersString[i]);
            System.out.println(numbersArray[i]);
        }
        return numbersArray;
    }
}