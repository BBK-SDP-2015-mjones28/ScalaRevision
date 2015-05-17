package CollectionFunctions

object colfunctions {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(85); 
  
  val mappy = Map(1 -> "sheep");System.out.println("""mappy  : scala.collection.immutable.Map[Int,String] = """ + $show(mappy ));$skip(14); val res$0 = 
  
  mappy(1);System.out.println("""res0: String = """ + $show(res$0));$skip(20); val res$1 = 
  mappy.contains(1);System.out.println("""res1: Boolean = """ + $show(res$1));$skip(86); 
  
  val extensions = Map ("Steve" -> 100, "Bob" -> 110, "Jim" -> 999, "Tom" -> 9876);System.out.println("""extensions  : scala.collection.immutable.Map[String,Int] = """ + $show(extensions ));$skip(94); val res$2 = 
  //contains searches only index not value
  extensions.contains("Steve");System.out.println("""res2: Boolean = """ + $show(res$2));$skip(46); val res$3 =  //steve is an index
  extensions.contains("tom");System.out.println("""res3: Boolean = """ + $show(res$3));$skip(73); val res$4 =  // 2 is an index
  
  extensions.filter((namePhone: (String, Int)) => namePhone._2 < 200);System.out.println("""res4: scala.collection.immutable.Map[String,Int] = """ + $show(res$4));$skip(73); val res$5 = 
  extensions.filter((namePhone: (String, Int)) => namePhone._1 == "Jim");System.out.println("""res5: scala.collection.immutable.Map[String,Int] = """ + $show(res$5));$skip(114); val res$6 = 
  extensions.filter((namePhone: (String, Int)) => namePhone._1.length < 4) map ((x: (String, Int)) => x._1 + "y");System.out.println("""res6: scala.collection.immutable.Iterable[String] = """ + $show(res$6));$skip(101); 
  
  val phoneBook = Map("Mum" -> 520400, "Stevo" -> 123456, "leah" -> 77686209, "Woody" -> 9877876);System.out.println("""phoneBook  : scala.collection.immutable.Map[String,Int] = """ + $show(phoneBook ));$skip(30); val res$7 = 
  phoneBook.contains("Woody");System.out.println("""res7: Boolean = """ + $show(res$7));$skip(25); val res$8 = 
  phoneBook.get("Woody");System.out.println("""res8: Option[Int] = """ + $show(res$8));$skip(59); 
  
  val nums = Map(1 -> "Dave", 2 -> "Paul", 3 -> "Mike");System.out.println("""nums  : scala.collection.immutable.Map[Int,String] = """ + $show(nums ));$skip(14); val res$9 = 
  nums.get(1);System.out.println("""res9: Option[String] = """ + $show(res$9));$skip(40); 
  
  def timesTwo(n: Int) : Int = n * 2;System.out.println("""timesTwo: (n: Int)Int""");$skip(52); 
  
  val numList: List[Int] = List(1,2,3,4,5,6,7,8);System.out.println("""numList  : List[Int] = """ + $show(numList ));$skip(27); val res$10 = 
  
  numList map(timesTwo);System.out.println("""res10: List[Int] = """ + $show(res$10));$skip(33); val res$11 = 
  numList map (x => timesTwo(x));System.out.println("""res11: List[Int] = """ + $show(res$11));$skip(50); 
  
  
  def isEven(n: Int) : Boolean = n % 2 == 0;System.out.println("""isEven: (n: Int)Boolean""");$skip(31); val res$12 = 
  numList map (x => isEven(x));System.out.println("""res12: List[Boolean] = """ + $show(res$12));$skip(84); 
  
  val alphList: List[String] = List("a", "b", "c", "d", "e", "f", "g", "h", "i");System.out.println("""alphList  : List[String] = """ + $show(alphList ));$skip(24); val res$13 = 
  numList.zip(alphList);System.out.println("""res13: List[(Int, String)] = """ + $show(res$13));$skip(79); 
 
  val numers: List[List[Int]] = List(List(1,2,3), List(3,4,5), List(6,7,8));System.out.println("""numers  : List[List[Int]] = """ + $show(numers ));$skip(20); val res$14 = 
  
  numers.flatten;System.out.println("""res14: List[Int] = """ + $show(res$14));$skip(114); 
  
  def flat[T](xs: List[List[T]]): List[T] = xs match
  {
  	case Nil => Nil
  	case (x::y) => x ++ flat(y)
  };System.out.println("""flat: [T](xs: List[List[T]])List[T]""");$skip(18); val res$15 = 
  
  flat(numers);System.out.println("""res15: List[Int] = """ + $show(res$15));$skip(40); 
  
  val numList1 = List(9,10,11,12,13);System.out.println("""numList1  : List[Int] = """ + $show(numList1 ));$skip(153); 
  
  def join[T](xs: List[T], ys: List[T]): List[T] = xs match
  {
  	  case Nil => ys
  	  case (x::Nil) => ys
  	  case (x:: y) => x :: join(y,ys)
  };System.out.println("""join: [T](xs: List[T], ys: List[T])List[T]""");$skip(67); val res$16 = 
  
  join(numList, numList1) map (x=> if(isEven(x)) x else x + 10);System.out.println("""res16: List[Int] = """ + $show(res$16));$skip(76); val res$17 = 
                                                  
join (numList, alphList);System.out.println("""res17: List[Any] = """ + $show(res$17))}
  
  }
