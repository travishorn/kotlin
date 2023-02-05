object Hamming {

    fun compute(leftStrand: String, rightStrand: String): Int {
        if (leftStrand.length != rightStrand.length) throw IllegalArgumentException("left and right strands must be of equal length")
        if (leftStrand === rightStrand) return 0

        return leftStrand.zip(rightStrand).count { (c1, c2) -> c1 != c2 }
    }
}
