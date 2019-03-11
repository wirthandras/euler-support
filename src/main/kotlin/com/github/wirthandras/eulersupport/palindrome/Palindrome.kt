package com.github.wirthandras.eulersupport.palindrome

class Palindrome(val palindrome: String) {

    fun isPalindrome() :Boolean {
        if (palindrome.length == 1) {
            return true
        }
        var i: Int = 1
        while (i < palindrome.length) {
            if (palindrome.get(i) != palindrome.get(palindrome.length - 1 - i)) {
                return false
            }
            i++
        }
        return true
    }
}