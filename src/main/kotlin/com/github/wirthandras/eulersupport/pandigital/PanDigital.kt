package com.github.wirthandras.eulersupport.pandigital

class PanDigital {

    fun isPandigital(number: Int): Boolean {
        val numberAsString = number.toString()
        if(numberAsString.length > 10) {
            return false
        }
        val set = HashSet<Char>()
        for (c in numberAsString.toCharArray()) {
            if(!set.add(c)) {
                return false
            }
        }
        return true
    }
}