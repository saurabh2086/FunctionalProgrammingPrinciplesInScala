class Rational(x: Int, y: Int) {
    require(y > 0, "denominator must be positive")
}
// if the class input needs to follow a certaincinditions
//we can use require
// its a predefined function that takes condition and an optional
//message string

//if the condition requires is false
//IllegalArguementException is thrown with the given message
//string

