def sum(f: Int => Int): (Int, Int) => Int = {
    def sumF(a: Int, b: Int): Int =
        if(a > b) 0
        else f(a) + sumF(a+1, b)
    sumF
}

def sumInts = sum(x => x)
def sumCubes = sum(x => x*x*x)

sumCubes(1,10)

def sum_(f: Int => Int)(a: Int, b: Int): Int =
    if(a > b) 0 else f(a) + sum_(f)(a+1, b)


