package lecture1_7

object practice {

//recursion
def gcd (a: Int, b: Int): Int =
{
	if (b==0) a
	else gcd(b, a % b)
}                                                 //> gcd: (a: Int, b: Int)Int

gcd(14, 21)                                       //> res0: Int = 7

//if (21==0) 14 else gcd(21, 14 % 21)
//= if (false) 14 else gcd (21, 14 % 21)
//if(14 == 0) 21 else gcd (14, 21 % 14)
// = if (false) 21 else gcd (14, 21 % 14)
// if (7 == 0) 14 else (7, 14 % 7)
// = if (false) 14 else (14, 14 % 7)
// if (0 == 0) 7 else gcd (0, 7 % 0)
//7

def factorial(n: Int): Int = {
	if (n == 0) 1
	else n * factorial (n - 1)
}                                                 //> factorial: (n: Int)Int

factorial(4)                                      //> res1: Int = 24

//if(4==0) 1 else 4 * (4 - 1)
// 4 * factorial (3)
// 4 * (3 * factorial(2))
// 4 * (3 * (2 * factorial(1)))
// 4 * (3 * (2 * (1 * factorial(0)))
// 4 * (3 * (2 * (1 * 1)))


def factorialTail(n: Int) : Int =
{
	def loop (acc: Int, n: Int) : Int =
	{
		if (n == 0) 1
		else loop(acc * n, n - 1)
	}
	
	loop(1, n)

}                                                 //> factorialTail: (n: Int)Int

factorial (4)                                     //> res2: Int = 24

// 1, 4 = loop (1 * 4, 4 - 1)
// 4, 3 = loop (4 * 3, 3 - 1)
// 12, 2 = loop (12 * 2, 2 - 1)
// 24, 1 = loop (24 * 1, 1 - 1)
// 1
//

}