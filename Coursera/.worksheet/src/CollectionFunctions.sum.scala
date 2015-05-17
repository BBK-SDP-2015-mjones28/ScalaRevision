package CollectionFunctions

object sum {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(144); 

 def sum(f: Int => Int)(a: Int, b: Int) : Int =
 {
 		if (a > b) 0
 		else f(a) + sum(f)(a + 1, b)
 };System.out.println("""sum: (f: Int => Int)(a: Int, b: Int)Int""");$skip(24); val res$0 = 
 
 sum(x => x + x)(2,4);System.out.println("""res0: Int = """ + $show(res$0));$skip(154); 


def sum1(f: Int => Int)(a: Int, b: Int): Int =
{
	def loop(a: Int, acc: Int): Int =
	{
		if (a > b) acc
		else loop(a + 1, f(a) + acc)
	}
	loop(a, 0)
};System.out.println("""sum1: (f: Int => Int)(a: Int, b: Int)Int""");$skip(23); val res$1 = 
 sum1(x => x + x)(2,4);System.out.println("""res1: Int = """ + $show(res$1))}


}
