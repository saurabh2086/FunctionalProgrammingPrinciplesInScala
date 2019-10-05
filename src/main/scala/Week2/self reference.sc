// On the inside of the class "this" represents the object on which the current method is executed
class Rational(x: Int, y: Int) {
    private def gcd(a: Int, b: Int): Int = if (b==0) a else gcd(b, a % b)

    val numer = x/ gcd(x, y)
    val denom = y/ gcd(x, y)

    def less(that: Rational) =
        this.numer * that.denom < that.numer * this.denom

    def max(that: Rational) =
        if (this.less(that)) that else this

}
