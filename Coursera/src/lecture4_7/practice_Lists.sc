package lecture4_7

object practice_Lists {


val lets = "A" :: ("B" ::("C" :: Nil))            //> lets  : List[String] = List(A, B, C)
val letts = "A" :: "B" :: "C" :: Nil              //> letts  : List[String] = List(A, B, C)

letts.isEmpty                                     //> res0: Boolean = false
!(letts.isEmpty)                                  //> res1: Boolean = true

val list = List(1,2,3,4,5,6,7,8,9)                //> list  : List[Int] = List(1, 2, 3, 4, 5, 6, 7, 8, 9)

list drop 3                                       //> res2: List[Int] = List(4, 5, 6, 7, 8, 9)
val l1 = List(2,6,9,1,3,7,4,10,20,9)              //> l1  : List[Int] = List(2, 6, 9, 1, 3, 7, 4, 10, 20, 9)


def sort(x: List[Int]): List[Int] = x match
{
	case List() => List()
	case (xs::ys) => insert(xs, sort(ys))
}                                                 //> sort: (x: List[Int])List[Int]

def insert(x: Int, y: List[Int]) : List[Int] = y match
{
	case List() => List(x)
	case (xs::ys) => if (x <= xs) x :: y else xs :: insert(x, ys)
}                                                 //> insert: (x: Int, y: List[Int])List[Int]

sort(l1)                                          //> res3: List[Int] = List(1, 2, 3, 4, 6, 7, 9, 9, 10, 20)


}