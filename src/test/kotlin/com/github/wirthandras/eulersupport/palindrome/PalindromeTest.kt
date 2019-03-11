package com.github.wirthandras.eulersupport.palindrome

import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class PalindromeTest {

    @Test
    fun testEmpty() {
        assertTrue(Palindrome("").isPalindrome())
    }

    @Test
    fun testOneLetter() {
        assertTrue(Palindrome("p").isPalindrome())
    }

    @Test
    fun testTwoLetterShouldFail() {
        assertFalse(Palindrome("pa").isPalindrome())
    }

    @Test
    fun testPalindromeShouldBeGood() {
        assertTrue(Palindrome("pap").isPalindrome())
    }

    @Test
    fun testNotPalindromeShouldBeFail() {
        assertFalse(Palindrome("papa").isPalindrome())
    }

}