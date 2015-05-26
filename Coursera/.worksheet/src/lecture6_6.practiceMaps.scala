package lecture6_6

object practiceMaps {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(90); 

 val roman = Map("I" -> 1, "V" -> 5, "x" -> 10);System.out.println("""roman  : scala.collection.immutable.Map[String,Int] = """ + $show(roman ));$skip(84); 
 val capital = Map("US" -> "Washington", "Wales" -> "Cardiff", "France" -> "Paris");System.out.println("""capital  : scala.collection.immutable.Map[String,String] = """ + $show(capital ));$skip(131); 
 def showCap(cap: String): String = capital.get(cap) match
 {
 	case Some(capital) => capital
 	case None => "No capital found"
 };System.out.println("""showCap: (cap: String)String""");$skip(46); val res$0 = 
   
 
 //Maps are functions
capital("Wales");System.out.println("""res0: String = """ + $show(res$0));$skip(24); val res$1 = 


capital get "Cardiff";System.out.println("""res1: Option[String] = """ + $show(res$1));$skip(17); val res$2 = 
capital get "US";System.out.println("""res2: Option[String] = """ + $show(res$2));$skip(19); val res$3 = 

showCap("Hungry");System.out.println("""res3: String = """ + $show(res$3));$skip(17); val res$4 = 
showCap("Wales");System.out.println("""res4: String = """ + $show(res$4));$skip(57); 

val fruit = List("apple", "pear", "orange", "pinapple");System.out.println("""fruit  : List[String] = """ + $show(fruit ));$skip(23); val res$5 = 
fruit groupBy (_.head);System.out.println("""res5: scala.collection.immutable.Map[Char,List[String]] = """ + $show(res$5));$skip(25); val res$6 = 
fruit groupBy (_.length);System.out.println("""res6: scala.collection.immutable.Map[Int,List[String]] = """ + $show(res$6));$skip(54); 

val p1 = new Poly(Map(1 -> 2.0, 3 -> 4.0, 5 -> 6.2));System.out.println("""p1  : lecture6_6.Poly = """ + $show(p1 ));$skip(42); 
val p2= new Poly(Map(0 -> 3.0, 3 -> 7.0));System.out.println("""p2  : lecture6_6.Poly = """ + $show(p2 ));$skip(8); val res$7 = 
p1 + p2;System.out.println("""res7: lecture6_6.Poly = """ + $show(res$7))}




}





class Poly(val terms: Map[Int, Double])
{
		def + (other: Poly) = new Poly(terms ++ (other.terms map adjust))
		def adjust (term: (Int, Double)): (Int,Double) =
		{
			val (ex, co) = term
			terms get ex match
			{
				case Some(co1) => ex -> (co + co1)
				case None => ex -> co
			}
		}
		override def toString =
		(for ((exp, co) <- terms.toList.sorted.reverse) yield co + "x^" + exp) mkString " + "
}
