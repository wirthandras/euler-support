package com.github.wirthandras.eulersupport.pandigital

class PanDigital() {

    private var exceptions: Set<Char>? = null

    fun isPandigital(number: Long): Boolean {
        val numberAsString = number.toString()
        if (numberAsString.length > 10) {
            return false
        }
        val set = HashSet<Char>()
        for (c in numberAsString.toCharArray()) {
            if (hitException(c) && !set.add(c)) {
                return false
            }
        }
        return true
    }

    private fun hitException(c: Char): Boolean {
        if (exceptions == null) {
            return true
        } else {
            return exceptions != null && !exceptions!!.contains(c)
        }
    }

    fun addExceptions(exceptions: Set<Char>) {
        this.exceptions = exceptions
    }
}