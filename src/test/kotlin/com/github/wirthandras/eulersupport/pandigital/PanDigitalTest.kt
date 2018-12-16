package com.github.wirthandras.eulersupport.pandigital

import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class PanDigitalTest {

    private var test: PanDigital = PanDigital()

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
}