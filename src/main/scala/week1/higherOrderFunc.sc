def sumInt(a: Int, b: Int): Int =
    if (a > b) 0 else a + sumInt(a+1, b)

def sumCubes(a: Int, b: Int): Int =
    if (a > b) 0 else cube(a) + sumCubes(a+1, b)

def sum(f: Int => Int, a: Int, b: Int): Int = {
    if(a > b) 0
    else f(a) + sum(f, a + 1, b)
}
def id(x: Int): Int = x
def cube(x: Int): Int = x * x * x
def fact(x: Int): Int = if(x ==0) 1 else fact(x-1)

def sumInts(a: Int, b: Int)  = sum(id, a, b)
def sumcubes(a: Int, b: Int): Int = sum(cube, a, b)
def sumFacts(a: Int, b: Int): Int = sum(fact, a, b)