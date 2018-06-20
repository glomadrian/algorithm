package com.github.glomadrian.algorithms.string

import org.junit.Assert
import org.junit.Test

/**
 * @author Adrián García Lomas
 */
class HighestValuePalindromeTest {

  @Test
  fun `should return 992299 on 092282 with 3 actions`() {
    val initValue = intArrayOf(0,9,2,2,8,2)
    val availableActions = 3
    val highestValuePalindrome = HighestValuePalindrome()

    val result = highestValuePalindrome.execute(initValue, availableActions)

    Assert.assertEquals("992299", result)
  }


  @Test
  fun `should return 3993 on 3943 with 1 action`() {
    val initValue = intArrayOf(3,9,4,3)
    val availableActions = 1
    val highestValuePalindrome = HighestValuePalindrome()

    val result = highestValuePalindrome.execute(initValue, availableActions)

    Assert.assertEquals("3993", result)
  }

  @Test
  fun `should return 942249 on 532248 with 3 actions`() {
    val initValue = intArrayOf(5,3,2,2,4,8)
    val availableActions = 3
    val highestValuePalindrome = HighestValuePalindrome()

    val result = highestValuePalindrome.execute(initValue, availableActions)

    Assert.assertEquals("942249", result)
  }

  @Test(expected = HighestValuePalindrome.InvalidPalindromeException::class)
  fun `should fail because 0011 with 1 change is not valid palindrome`(){
    val initValue = intArrayOf(0,0,1,1)
    val availableActions = 1
    val highestValuePalindrome = HighestValuePalindrome()

    highestValuePalindrome.execute(initValue, availableActions)
  }

}