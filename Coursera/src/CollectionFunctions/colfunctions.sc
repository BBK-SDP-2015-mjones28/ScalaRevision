package CollectionFunctions

object colfunctions {
  
  val mappy = Map(1 -> "sheep")                   //> mappy  : scala.collection.immutable.Map[Int,String] = Map(1 -> sheep)
  
  mappy(1)                                        //> res0: String = sheep
  mappy.contains(1)                               //> res1: Boolean = true
  
  val extensions = Map ("Steve" -> 100, "Bob" -> 110, "Jim" -> 999, "Tom" -> 9876)
                                                  //> extensions  : scala.collection.immutable.Map[String,Int] = Map(Steve -> 100,
                                                  //|  Bob -> 110, Jim -> 999, Tom -> 9876)
  //contains searches only index not value
  extensions.contains("Steve") //steve is an index//> res2: Boolean = true
  extensions.contains("tom") // 2 is an index     //> res3: Boolean = false
  
  extensions.filter((namePhone: (String, Int)) => namePhone._2 < 200)
                                                  //> res4: scala.collection.immutable.Map[String,Int] = Map(Steve -> 100, Bob -> 
                                                  //| 110)
  extensions.filter((namePhone: (String, Int)) => namePhone._1 == "Jim")
                                                  //> res5: scala.collection.immutable.Map[String,Int] = Map(Jim -> 999)
  extensions.filter((namePhone: (String, Int)) => namePhone._1.length < 4) map ((x: (String, Int)) => x._1 + "y")
                                                  //> res6: scala.collection.immutable.Iterable[String] = List(Boby, Jimy, Tomy)
  
  val phoneBook = Map("Mum" -> 520400, "Stevo" -> 123456, "leah" -> 77686209, "Woody" -> 9877876)
                                                  //> phoneBook  : scala.collection.immutable.Map[String,Int] = Map(Mum -> 520400,
                                                  //|  Stevo -> 123456, leah -> 77686209, Woody -> 9877876)
  phoneBook.contains("Woody")                     //> res7: Boolean = true
  phoneBook.get("Woody")                          //> res8: Option[Int] = Some(9877876)
  
  val nums = Map(1 -> "Dave", 2 -> "Paul", 3 -> "Mike")
                                                  //> nums  : scala.collection.immutable.Map[Int,String] = Map(1 -> Dave, 2 -> Pau
                                                  //| l, 3 -> Mike)
  nums.get(1)                                     //> res9: Option[String] = Some(Dave)
  
  def timesTwo(n: Int) : Int = n * 2              //> timesTwo: (n: Int)Int
  
  val numList: List[Int] = List(1,2,3,4,5,6,7,8)  //> numList  : List[Int] = List(1, 2, 3, 4, 5, 6, 7, 8)
  
  numList map(timesTwo)                           //> res10: List[Int] = List(2, 4, 6, 8, 10, 12, 14, 16)
  numList map (x => timesTwo(x))                  //> res11: List[Int] = List(2, 4, 6, 8, 10, 12, 14, 16)
  
  
  def isEven(n: Int) : Boolean = n % 2 == 0       //> isEven: (n: Int)Boolean
  numList map (x => isEven(x))                    //> res12: List[Boolean] = List(false, true, false, true, false, true, false, t
                                                  //| rue)
  
  val alphList: List[String] = List("a", "b", "c", "d", "e", "f", "g", "h", "i")
                                                  //> alphList  : List[String] = List(a, b, c, d, e, f, g, h, i)
  numList.zip(alphList)                           //> res13: List[(Int, String)] = List((1,a), (2,b), (3,c), (4,d), (5,e), (6,f),
                                                  //|  (7,g), (8,h))
 
  val numers: List[List[Int]] = List(List(1,2,3), List(3,4,5), List(6,7,8))
                                                  //> numers  : List[List[Int]] = List(List(1, 2, 3), List(3, 4, 5), List(6, 7, 8
                                                  //| ))
  
  numers.flatten                                  //> res14: List[Int] = List(1, 2, 3, 3, 4, 5, 6, 7, 8)
  
  def flat[T](xs: List[List[T]]): List[T] = xs match
  {
  	case Nil => Nil
  	case (x::y) => x ++ flat(y)
  }                                               //> flat: [T](xs: List[List[T]])List[T]
  
  flat(numers)                                    //> res15: List[Int] = List(1, 2, 3, 3, 4, 5, 6, 7, 8)
  
  val numList1 = List(9,10,11,12,13)              //> numList1  : List[Int] = List(9, 10, 11, 12, 13)
  
  def join[T](xs: List[T], ys: List[T]): List[T] = xs match
  {
  	  case Nil => ys
  	  case (x::Nil) => ys
  	  case (x:: y) => x :: join(y,ys)
  }                                               //> join: [T](xs: List[T], ys: List[T])List[T]
  
  join(numList, numList1) map (x=> if(isEven(x)) x else x + 10)
                                                  //> res16: List[Int] = List(11, 2, 13, 4, 15, 6, 17, 19, 10, 21, 12, 23)
                                                  
join (numList, alphList)                          //> res17: List[Any] = List(1, 2, 3, 4, 5, 6, 7, a, b, c, d, e, f, g, h, i)
  
  }