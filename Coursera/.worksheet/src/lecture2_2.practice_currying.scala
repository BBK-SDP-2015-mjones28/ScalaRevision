package lecture2_2

object practice_currying {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(169); 

//using currying


def product(f: Int => Int)(a: Int, b: Int) :Int =
{
	if (a > b) 1
	else f(a) * product(f)(a + 1, b)

};System.out.println("""product: (f: Int => Int)(a: Int, b: Int)Int""");$skip(27); val res$0 = 

product(x => x * x)(3, 4);System.out.println("""res0: Int = """ + $show(res$0));$skip(48); 


def factorial(n: Int) = product(x => x)(1, n);System.out.println("""factorial: (n: Int)Int""");$skip(13); val res$1 = 
factorial(5);System.out.println("""res1: Int = """ + $show(res$1))}

}
