package lecture6_6

object TutorialPointMap {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(76); 
	var A: Map[Char, Int] = Map();System.out.println("""A  : Map[Char,Int] = """ + $show(A ));$skip(84); 
	
	var colours = Map("red" -> "#FF0000", "azure" -> "#F0FFFF", "peru" -> "#CD853F");System.out.println("""colours  : scala.collection.immutable.Map[String,String] = """ + $show(colours ));$skip(19); 
	
	A += ('I' -> 1);$skip(12); val res$0 = 
A get ('I');System.out.println("""res0: Option[Int] = """ + $show(res$0));$skip(7); val res$1 = 
A('I');System.out.println("""res1: Int = """ + $show(res$1));$skip(17); 

A += ('J' -> 5);$skip(17); 
A += ('K' -> 10);$skip(18); 
A += ('L' -> 100);$skip(33); 

val B = A.toList.sorted.reverse;System.out.println("""B  : List[(Char, Int)] = """ + $show(B ));$skip(11); val res$2 = 

A.isEmpty;System.out.println("""res2: Boolean = """ + $show(res$2));$skip(14); val res$3 = 

colours.keys;System.out.println("""res3: Iterable[String] = """ + $show(res$3));$skip(15); val res$4 = 
colours.values;System.out.println("""res4: Iterable[String] = """ + $show(res$4));$skip(87); 

colours.keys.foreach{
 i => print ("Key = " + i)
 println(" value = " + colours(i))
}}

}
