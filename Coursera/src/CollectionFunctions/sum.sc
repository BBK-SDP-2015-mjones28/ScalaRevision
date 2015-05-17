package CollectionFunctions

object sum {

 def sum(f: Int => Int)(a: Int, b: Int) : Int =
 {
 		if (a > b) 0
 		else f(a) + sum(f)(a + 1, b)
 }                                                //> sum: (f: Int => Int)(a: Int, b: Int)Int
 
 sum(x => x + x)(2,4)                             //> res0: Int = 18


def sum1(f: Int => Int)(a: Int, b: Int): Int =
{
	def loop(a: Int, acc: Int): Int =
	{
		if (a > b) acc
		else loop(a + 1, f(a) + acc)
	}
	loop(a, 0)
}                                                 //> sum1: (f: Int => Int)(a: Int, b: Int)Int
 sum1(x => x + x)(2,4)                            //> res1: Int = 18


}