package com.github.glomadrian.algorithms.implementation

/**
 * https://www.hackerrank.com/challenges/organizing-containers-of-balls/problem
 */
class OrganizingContainersOfBalls {

    fun execute(query: Array<Array<Int>>) : Boolean {
        val containers = obtainContainersCapacity(query).sortedArray()
        val ballTypes = obtainBallTypesAmount(query).sortedArray()
        return containers contentEquals  ballTypes
    }

    private fun obtainBallTypesAmount(query: Array<Array<Int>>) =
            query.foldRightIndexed(Array(query.size, {0}), { index, container, acc ->
              container.mapIndexed { index, i ->
                acc[index] += i
              }
               acc
            })

    private fun obtainContainersCapacity(query: Array<Array<Int>>) =
        query.foldRightIndexed(Array(query.size, {0}), {index, container, acc ->
            container.map { acc[index] += it }
            acc
        })
}