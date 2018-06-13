package com.github.glomadrian.algorithms.implementation

import org.junit.Assert.*
import org.junit.Test


class OrganizingContainersOfBallsTest {

    @Test
    fun `should be possible to organize the balls`() {
        val query = arrayOf(
                arrayOf(0,0,5,0),
                arrayOf(4,0,0,0),
                arrayOf(0,2,0,1),
                arrayOf(0,1,0,2)
        )
        val algorithm = OrganizingContainersOfBalls()

        val result = algorithm.execute(query)

        assertTrue(result)
    }

    @Test
    fun `should be possible to organize the balls II`() {
        val query = arrayOf(
                arrayOf(0,4,0),
                arrayOf(2,0,1),
                arrayOf(1,0,2)
        )
        val algorithm = OrganizingContainersOfBalls()

        val result = algorithm.execute(query)

        assertTrue(result)
    }

    @Test
    fun `should be possible to organize the balls III`() {
        val query = arrayOf(
                arrayOf(0,4,0),
                arrayOf(2,0,1),
                arrayOf(1,0,2)
        )
        val algorithm = OrganizingContainersOfBalls()

        val result = algorithm.execute(query)

        assertTrue(result)
    }

    @Test
    fun `should be possible to organize the balls IV`() {
        val query = arrayOf(
                arrayOf(1,2,3,4),
                arrayOf(2,1,4,3),
                arrayOf(3,4,2,1),
                arrayOf(4,3,1,2)
        )
        val algorithm = OrganizingContainersOfBalls()

        val result = algorithm.execute(query)

        assertTrue(result)
    }

    @Test
    fun `shouldt be possible to organize the balls`(){
        val query = arrayOf(
                arrayOf(1,2,1,3),
                arrayOf(2,1,3,1),
                arrayOf(1,3,2,1),
                arrayOf(3,2,1,1)
        )
        val algorithm = OrganizingContainersOfBalls()

        val result = algorithm.execute(query)

        assertFalse(result)
    }

}