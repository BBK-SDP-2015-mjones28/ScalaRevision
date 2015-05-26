package lecture5_1

object practiceListMethods {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(136); 


def last[T](l: List[T]) : T = l match
{
	case (x::Nil) => x
	case (x::y) => last(y)
};System.out.println("""last: [T](l: List[T])T""");$skip(102); 


def init[T](l:List[T]) : List[T] = l match
{
	case List(x) => List()
	case (x::y) => x :: init(y)
};System.out.println("""init: [T](l: List[T])List[T]""");$skip(95); 



def take[T](n: Int, l: List[T]): List[T] =
{
	if (n >= l.length) l
	else take(n, init(l))
};System.out.println("""take: [T](n: Int, l: List[T])List[T]""");$skip(54); 



 val l1 = List("Hope", "you", "die", "in", "hell");System.out.println("""l1  : List[String] = """ + $show(l1 ));$skip(10); val res$0 = 
 last(l1);System.out.println("""res0: String = """ + $show(res$0));$skip(10); val res$1 = 

init(l1);System.out.println("""res1: List[String] = """ + $show(res$1));$skip(12); val res$2 = 
take(2, l1);System.out.println("""res2: List[String] = """ + $show(res$2))}

}
