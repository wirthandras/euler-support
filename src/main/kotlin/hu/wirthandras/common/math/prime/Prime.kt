package hu.wirthandras.common.math.prime

class Prime(private val number: Int) {

    fun isPrime(): Boolean {
        if (number == 2)
            return true
        if (number < 2 || number % 2 == 0)
            return false
        var i = 3
        while (i * i <= number) {
            if (number % i == 0)
                return false
            i += 2
        }
        return true
    }

}