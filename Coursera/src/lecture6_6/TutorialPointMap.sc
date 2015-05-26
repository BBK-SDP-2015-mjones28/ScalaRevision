package lecture6_6

object TutorialPointMap {
	var A: Map[Char, Int] = Map()             //> A  : Map[Char,Int] = Map()
	
	var colours = Map("red" -> "#FF0000", "azure" -> "#F0FFFF", "peru" -> "#CD853F")
                                                  //> colours  : scala.collection.immutable.Map[String,String] = Map(red -> #FF000
                                                  //| 0, azure -> #F0FFFF, peru -> #CD853F)
	
	A += ('I' -> 1)
A get ('I')                                       //> res0: Option[Int] = Some(1)
A('I')                                            //> res1: Int = 1

A += ('J' -> 5)
A += ('K' -> 10)
A += ('L' -> 100)

val B = A.toList.sorted.reverse                   //> B  : List[(Char, Int)] = List((L,100), (K,10), (J,5), (I,1))

A.isEmpty                                         //> res2: Boolean = false

colours.keys                                      //> res3: Iterable[String] = Set(red, azure, peru)
colours.values                                    //> res4: Iterable[String] = MapLike(#FF0000, #F0FFFF, #CD853F)

colours.keys.foreach{
 i => print ("Key = " + i)
 println(" value = " + colours(i))
}                                                 //> Key = red value = #FF0000
                                                  //| Key = azure value = #F0FFFF
                                                  //| Key = peru value = #CD853F

}