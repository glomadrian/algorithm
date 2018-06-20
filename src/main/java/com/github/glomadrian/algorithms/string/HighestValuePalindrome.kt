package com.github.glomadrian.algorithms.string

/**
 * @author Adrián García Lomas
 */

class HighestValuePalindrome {

  private var actions = 0

  fun execute(values: IntArray, actions: Int): String {
    this.actions = actions
    val pointers = getFirstPointers(values)
    evaluate(values, pointers)
    return values.joinToString("")
  }

  private fun evaluate(values: IntArray, pointers: Pair<Int, Int>) {
    if (isLast(values, pointers)) {
      when {
        actions >= 2 -> {
          putMaxInAllPossible(values, pointers)
        }
        actions == 1 -> {
          changeValuesToMax(values, pointers)
          actions--
        }
        else -> {
          if (!areTheValuesEquals(values, pointers)) {
            throw InvalidPalindromeException()
          }
        }
      }
    } else {
      if (areTheValuesEquals(values, pointers)) {
        evaluate(values, getNextPointers(pointers))
      } else {
        if (actions > 0) {
          changeValuesToMax(values, pointers)
          actions--
          evaluate(values, getNextPointers(pointers))
        } else {
          throw InvalidPalindromeException()
        }
      }
    }
  }

  private fun putMaxInAllPossible(values: IntArray, pointers: Pair<Int, Int>) {
    val changes = actions / 2
    var currentPointers = pointers
    for (i in 1..changes) {
      changeTo99(values, currentPointers)
      if (isFirst(values, currentPointers)) {
        break
      } else {
        currentPointers = getPreviousPointers(pointers)
      }
    }
  }

  private fun changeTo99(values: IntArray, pointers: Pair<Int, Int>) {
    values[pointers.first] = 9
    values[pointers.second] = 9
  }

  private fun getFirstPointers(values: IntArray): Pair<Int, Int> =
    if (values.size % 2 == 0) {
      val middle = values.size / 2
      Pair(middle - 1, middle)
    } else {
      val middle = values.size / 2
      Pair(middle, middle + 2)
    }

  private fun isLast(values: IntArray, pointers: Pair<Int, Int>) =
    pointers.first == 0 && pointers.second == values.size - 1

  private fun isFirst(values: IntArray, pointers: Pair<Int, Int>): Boolean {
    val firstPointers = getFirstPointers(values)
    return pointers.first == firstPointers.first && pointers.second == firstPointers.second
  }

  private fun getPreviousPointers(pointers: Pair<Int, Int>) = Pair(pointers.first + 1, pointers.second - 1)

  private fun areTheValuesEquals(values: IntArray, pointers: Pair<Int, Int>) =
    values[pointers.first] == values[pointers.second]

  private fun getNextPointers(pointers: Pair<Int, Int>) = Pair(pointers.first - 1, pointers.second + 1)

  private fun changeValuesToMax(values: IntArray, pointers: Pair<Int, Int>) {
    if (values[pointers.first] > values[pointers.second]) {
      values[pointers.second] = values[pointers.first]
    } else {
      values[pointers.first] = values[pointers.second]
    }
  }

  class InvalidPalindromeException : Exception()
}