// Data abstraction
class Rational(x: Int, y: Int) {
    private def gcd(a: Int, b: Int): Int = if (b==0) a else gcd(b, a % b)
    private val g = gcd(x, y)

    def numer = x/g
    def denom = y/g

    override def toString: String = numer + "/" + denom
}

// Data abstraction 2
// we use the gcd directly
// advantegious when numer and denom called infrequestly

class Rational2(x: Int, y: Int) {
    private def gcd(a: Int, b: Int): Int = if (b ==0) a else gcd(b, a % b)

    def numer = x / gcd(x, y)
    def denom = y/gcd(x, y)

    override def toString: String = numer + "/" + denom
}
// This is useful if numer and denom are called often
class Rational(x: Int, y: Int) {
    private def gcd(a: Int, b: Int): Int = if (b ==0) a else gcd(b, a % b)

    val numer = x/gcd(x, y)
    val denom = y/gcd(x, y)
}

//the ability to choose different implementation of data without affectinf clients
//is called data abstraction

