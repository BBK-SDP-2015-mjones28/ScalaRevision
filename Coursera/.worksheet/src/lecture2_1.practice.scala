package lecture2_1

object practice {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(153); 

//sum of ints between two numbers
def sumInts(a: Int, b: Int): Int =
{
	if (a > b) 0
	else a + sumInts(a + 1, b)
};System.out.println("""sumInts: (a: Int, b: Int)Int""");$skip(16); val res$0 = 

sumInts (2, 4);System.out.println("""res0: Int = """ + $show(res$0));$skip(30); 

def cube(n: Int) = n * n * n;System.out.println("""cube: (n: Int)Int""");$skip(195); 

//sum of all number between two intergers,
//each cubes before addition
def sumOfCubes(a: Int, b: Int) : Int =
{
	if (a > b) 0
	else cube(a) + sumOfCubes(a + 1, b)
	//a + 1 is the accumalator
};System.out.println("""sumOfCubes: (a: Int, b: Int)Int""");$skip(17); val res$1 = 
sumOfCubes(2, 4);System.out.println("""res1: Int = """ + $show(res$1));$skip(117); 

//passing a function
def sum(f: Int => Int, a: Int, b: Int) : Int =
{
	if (a > b) 0
	else f(a) + sum(f, a + 1, b)
};System.out.println("""sum: (f: Int => Int, a: Int, b: Int)Int""");$skip(17); val res$2 = 

sum(cube, 2, 4);System.out.println("""res2: Int = """ + $show(res$2));$skip(22); val res$3 = 
sum(x => x + x, 2, 4);System.out.println("""res3: Int = """ + $show(res$3));$skip(67); 

def fun(f: (Int, Int) => Int)(a: Int, b: Int) : Int =
{
	f(a,b)
};System.out.println("""fun: (f: (Int, Int) => Int)(a: Int, b: Int)Int""");$skip(28); val res$4 = 

fun ((a,b) => a + b)(2, 4);System.out.println("""res4: Int = """ + $show(res$4));$skip(157); 

def sumRec(f: Int => Int)(a: Int, b: Int) : Int =
{
	def loop(a: Int, acc: Int) : Int =
	{
		if (a > b) acc
		else loop(a + 1, f(a) + acc)
	}
	loop(a, 0)
};System.out.println("""sumRec: (f: Int => Int)(a: Int, b: Int)Int""");$skip(26); val res$5 = 

sumRec(x => x + x)(2, 4);System.out.println("""res5: Int = """ + $show(res$5))}
}
