package lecture2_1

object practice {

//sum of ints between two numbers
def sumInts(a: Int, b: Int): Int =
{
	if (a > b) 0
	else a + sumInts(a + 1, b)
}                                                 //> sumInts: (a: Int, b: Int)Int

sumInts (2, 4)                                    //> res0: Int = 9

def cube(n: Int) = n * n * n                      //> cube: (n: Int)Int

//sum of all number between two intergers,
//each cubes before addition
def sumOfCubes(a: Int, b: Int) : Int =
{
	if (a > b) 0
	else cube(a) + sumOfCubes(a + 1, b)
	//a + 1 is the accumalator
}                                                 //> sumOfCubes: (a: Int, b: Int)Int
sumOfCubes(2, 4)                                  //> res1: Int = 99

//passing a function
def sum(f: Int => Int, a: Int, b: Int) : Int =
{
	if (a > b) 0
	else f(a) + sum(f, a + 1, b)
}                                                 //> sum: (f: Int => Int, a: Int, b: Int)Int

sum(cube, 2, 4)                                   //> res2: Int = 99
sum(x => x + x, 2, 4)                             //> res3: Int = 18

def fun(f: (Int, Int) => Int)(a: Int, b: Int) : Int =
{
	f(a,b)
}                                                 //> fun: (f: (Int, Int) => Int)(a: Int, b: Int)Int

fun ((a,b) => a + b)(2, 4)                        //> res4: Int = 6

def sumRec(f: Int => Int)(a: Int, b: Int) : Int =
{
	def loop(a: Int, acc: Int) : Int =
	{
		if (a > b) acc
		else loop(a + 1, f(a) + acc)
	}
	loop(a, 0)
}                                                 //> sumRec: (f: Int => Int)(a: Int, b: Int)Int

sumRec(x => x + x)(2, 4)                          //> res5: Int = 18
}