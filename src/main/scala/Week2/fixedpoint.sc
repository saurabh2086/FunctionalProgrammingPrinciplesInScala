// finding fixed point
 val tolerance = 0.00001
import math.abs

def isCloseEnough(x: Double, y: Double) =
    abs((x-y)/x) / x  < tolerance
def fixedPoint(f: Double => Double)(firstGuess: Double) = {
    def iterate(guess: Double): Double = {
        val next = f(guess)
        println(next)
        if(isCloseEnough(guess, next)) next
        else iterate(next)
    }
    iterate(firstGuess)
}

def sqrt(x:Double) = fixedPoint(y =>(y+ x/y)/2)(1.0)

sqrt(2.0)


