package lecture1_7

object practice {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(119); 

//recursion
def gcd (a: Int, b: Int): Int =
{
	if (b==0) a
	else gcd(b, a % b)
};System.out.println("""gcd: (a: Int, b: Int)Int""");$skip(13); val res$0 = 

gcd(14, 21);System.out.println("""res0: Int = """ + $show(res$0));$skip(352); 

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
};System.out.println("""factorial: (n: Int)Int""");$skip(14); val res$1 = 

factorial(4);System.out.println("""res1: Int = """ + $show(res$1));$skip(316); 

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

};System.out.println("""factorialTail: (n: Int)Int""");$skip(15); val res$2 = 

factorial (4);System.out.println("""res2: Int = """ + $show(res$2))}

// 1, 4 = loop (1 * 4, 4 - 1)
// 4, 3 = loop (4 * 3, 3 - 1)
// 12, 2 = loop (12 * 2, 2 - 1)
// 24, 1 = loop (24 * 1, 1 - 1)
// 1
//

}
