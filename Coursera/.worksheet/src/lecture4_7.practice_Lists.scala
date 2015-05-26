package lecture4_7

object practice_Lists {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(84); 


val lets = "A" :: ("B" ::("C" :: Nil));System.out.println("""lets  : List[String] = """ + $show(lets ));$skip(37); 
val letts = "A" :: "B" :: "C" :: Nil;System.out.println("""letts  : List[String] = """ + $show(letts ));$skip(15); val res$0 = 

letts.isEmpty;System.out.println("""res0: Boolean = """ + $show(res$0));$skip(17); val res$1 = 
!(letts.isEmpty);System.out.println("""res1: Boolean = """ + $show(res$1));$skip(36); 

val list = List(1,2,3,4,5,6,7,8,9);System.out.println("""list  : List[Int] = """ + $show(list ));$skip(13); val res$2 = 

list drop 3;System.out.println("""res2: List[Int] = """ + $show(res$2));$skip(37); 
val l1 = List(2,6,9,1,3,7,4,10,20,9);System.out.println("""l1  : List[Int] = """ + $show(l1 ));$skip(112); 


def sort(x: List[Int]): List[Int] = x match
{
	case List() => List()
	case (xs::ys) => insert(xs, sort(ys))
};System.out.println("""sort: (x: List[Int])List[Int]""");$skip(147); 

def insert(x: Int, y: List[Int]) : List[Int] = y match
{
	case List() => List(x)
	case (xs::ys) => if (x <= xs) x :: y else xs :: insert(x, ys)
};System.out.println("""insert: (x: Int, y: List[Int])List[Int]""");$skip(10); val res$3 = 

sort(l1);System.out.println("""res3: List[Int] = """ + $show(res$3))}


}
