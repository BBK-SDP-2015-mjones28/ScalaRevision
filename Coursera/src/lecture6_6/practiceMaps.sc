package lecture6_6

object practiceMaps {

 val roman = Map("I" -> 1, "V" -> 5, "x" -> 10)   //> roman  : scala.collection.immutable.Map[String,Int] = Map(I -> 1, V -> 5, x -
                                                  //| > 10)
 val capital = Map("US" -> "Washington", "Wales" -> "Cardiff", "France" -> "Paris")
                                                  //> capital  : scala.collection.immutable.Map[String,String] = Map(US -> Washing
                                                  //| ton, Wales -> Cardiff, France -> Paris)
 def showCap(cap: String): String = capital.get(cap) match
 {
 	case Some(capital) => capital
 	case None => "No capital found"
 }                                                //> showCap: (cap: String)String
   
 
 //Maps are functions
capital("Wales")                                  //> res0: String = Cardiff


capital get "Cardiff"                             //> res1: Option[String] = None
capital get "US"                                  //> res2: Option[String] = Some(Washington)

showCap("Hungry")                                 //> res3: String = No capital found
showCap("Wales")                                  //> res4: String = Cardiff

val fruit = List("apple", "pear", "orange", "pinapple")
                                                  //> fruit  : List[String] = List(apple, pear, orange, pinapple)
fruit groupBy (_.head)                            //> res5: scala.collection.immutable.Map[Char,List[String]] = Map(p -> List(pear
                                                  //| , pinapple), a -> List(apple), o -> List(orange))
fruit groupBy (_.length)                          //> res6: scala.collection.immutable.Map[Int,List[String]] = Map(8 -> List(pinap
                                                  //| ple), 5 -> List(apple), 4 -> List(pear), 6 -> List(orange))

val p1 = new Poly(Map(1 -> 2.0, 3 -> 4.0, 5 -> 6.2))
                                                  //> p1  : lecture6_6.Poly = 6.2x^5 + 4.0x^3 + 2.0x^1
val p2= new Poly(Map(0 -> 3.0, 3 -> 7.0))         //> p2  : lecture6_6.Poly = 7.0x^3 + 3.0x^0
p1 + p2                                           //> res7: lecture6_6.Poly = 6.2x^5 + 11.0x^3 + 2.0x^1 + 3.0x^0




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