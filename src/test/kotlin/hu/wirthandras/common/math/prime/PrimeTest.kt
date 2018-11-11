package hu.wirthandras.common.math.prime

import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class PrimeTest {

    @Test
    fun testNumberShouldPrime() {
        val p2 = Prime(2)
        assert(p2.isPrime())

        val p3 = Prime(3)
        assertTrue(p3.isPrime())

        val p97 = Prime(97)
        assertTrue(p97.isPrime())
    }

    @Test
    fun testNumberShouldNotPrime() {
        val p4 = Prime(4)
        assertFalse(p4.isPrime())

        val p35 = Prime(35)
        assertFalse(p35.isPrime())
    }

}