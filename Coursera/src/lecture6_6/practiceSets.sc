package lecture6_6

object practiceSets {
  val fruit = Set("apples", "oranges", "pears")   //> fruit  : scala.collection.immutable.Set[String] = Set(apples, oranges, pears)
                                                  //| 

 val nums: Set[Int] = Set()                       //> nums  : Set[Int] = Set()
 
 
 fruit.head                                       //> res0: String = apples
 fruit.tail                                       //> res1: scala.collection.immutable.Set[String] = Set(oranges, pears)
 
 
   val fruit1 = Set("apples", "oranges", "pears") //> fruit1  : scala.collection.immutable.Set[String] = Set(apples, oranges, pear
                                                  //| s)
   val fruit2 = Set("mangoes", "banana", "apples")//> fruit2  : scala.collection.immutable.Set[String] = Set(mangoes, banana, appl
                                                  //| es)
   
   fruit1 ++ fruit2                               //> res2: scala.collection.immutable.Set[String] = Set(banana, apples, mangoes, 
                                                  //| pears, oranges)
   val num = Set(5,6,9,20,30,45)                  //> num  : scala.collection.immutable.Set[Int] = Set(5, 20, 6, 9, 45, 30)
   
   
 def nth(n: Int, xs : List[Int]) = xs(n)          //> nth: (n: Int, xs: List[Int])Int
 val res = num.toList.sorted                      //> res  : List[Int] = List(5, 6, 9, 20, 30, 45)
 nth(3, res)                                      //> res3: Int = 20
  
  val fruity = List("Apples", "oranges", "pears", "apples")
                                                  //> fruity  : List[String] = List(Apples, oranges, pears, apples)
   val fruity1 = List("oranges", "pears", "apples")
                                                  //> fruity1  : List[String] = List(oranges, pears, apples)
  val res1 = fruity.toSet                         //> res1  : scala.collection.immutable.Set[String] = Set(Apples, oranges, pears,
                                                  //|  apples)
  fruit1 & fruit2                                 //> res4: scala.collection.immutable.Set[String] = Set(apples)
  fruit1 intersect(fruit2)                        //> res5: scala.collection.immutable.Set[String] = Set(apples)
  fruit1 count(_ == "apples")                     //> res6: Int = 1
  (fruit1 ++ fruit2) count (_ == "apples")        //> res7: Int = 1
  fruity1 count(_.head == 'a')                    //> res8: Int = 1
}