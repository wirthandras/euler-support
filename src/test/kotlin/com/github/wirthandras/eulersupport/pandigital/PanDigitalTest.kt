package com.github.wirthandras.eulersupport.pandigital

import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

class PanDigitalTest {

    private lateinit var test: PanDigital

    @BeforeEach
    fun setUp() {
        this.test = PanDigital()
    }

    @Test
    fun panDigitalShouldTrue() {
        assertTrue(test.isPandigital(1234))
        assertTrue(test.isPandigital(987456210))
    }

    @Test
    fun panDigitalShouldFalse() {
        assertFalse(test.isPandigital(1111))
        assertFalse(test.isPandigital(1010))
    }

    @Test
    fun panDigitalExceptionShouldFalse() {
        test.addExceptions(setOf('2'))
        assertFalse(test.isPandigital(1111))
        assertFalse(test.isPandigital(1010))
    }

    @Test
    fun panDigitalNumberLongerThanTenShouldFalse() {
        assertFalse(test.isPandigital(12345678901))
    }

}