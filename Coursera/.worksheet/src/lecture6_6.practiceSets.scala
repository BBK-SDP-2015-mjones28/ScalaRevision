package lecture6_6

object practiceSets {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(89); 
  val fruit = Set("apples", "oranges", "pears");System.out.println("""fruit  : scala.collection.immutable.Set[String] = """ + $show(fruit ));$skip(29); 

 val nums: Set[Int] = Set();System.out.println("""nums  : Set[Int] = """ + $show(nums ));$skip(16); val res$0 = 
 
 
 fruit.head;System.out.println("""res0: String = """ + $show(res$0));$skip(12); val res$1 = 
 fruit.tail;System.out.println("""res1: scala.collection.immutable.Set[String] = """ + $show(res$1));$skip(54); 
 
 
   val fruit1 = Set("apples", "oranges", "pears");System.out.println("""fruit1  : scala.collection.immutable.Set[String] = """ + $show(fruit1 ));$skip(51); 
   val fruit2 = Set("mangoes", "banana", "apples");System.out.println("""fruit2  : scala.collection.immutable.Set[String] = """ + $show(fruit2 ));$skip(24); val res$2 = 
   
   fruit1 ++ fruit2;System.out.println("""res2: scala.collection.immutable.Set[String] = """ + $show(res$2));$skip(33); 
   val num = Set(5,6,9,20,30,45);System.out.println("""num  : scala.collection.immutable.Set[Int] = """ + $show(num ));$skip(49); 
   
   
 def nth(n: Int, xs : List[Int]) = xs(n);System.out.println("""nth: (n: Int, xs: List[Int])Int""");$skip(29); 
 val res = num.toList.sorted;System.out.println("""res  : List[Int] = """ + $show(res ));$skip(13); val res$3 = 
 nth(3, res);System.out.println("""res3: Int = """ + $show(res$3));$skip(63); 
  
  val fruity = List("Apples", "oranges", "pears", "apples");System.out.println("""fruity  : List[String] = """ + $show(fruity ));$skip(52); 
   val fruity1 = List("oranges", "pears", "apples");System.out.println("""fruity1  : List[String] = """ + $show(fruity1 ));$skip(26); 
  val res1 = fruity.toSet;System.out.println("""res1  : scala.collection.immutable.Set[String] = """ + $show(res1 ));$skip(18); val res$4 = 
  fruit1 & fruit2;System.out.println("""res4: scala.collection.immutable.Set[String] = """ + $show(res$4));$skip(27); val res$5 = 
  fruit1 intersect(fruit2);System.out.println("""res5: scala.collection.immutable.Set[String] = """ + $show(res$5));$skip(30); val res$6 = 
  fruit1 count(_ == "apples");System.out.println("""res6: Int = """ + $show(res$6));$skip(43); val res$7 = 
  (fruit1 ++ fruit2) count (_ == "apples");System.out.println("""res7: Int = """ + $show(res$7));$skip(31); val res$8 = 
  fruity1 count(_.head == 'a');System.out.println("""res8: Int = """ + $show(res$8))}
}
