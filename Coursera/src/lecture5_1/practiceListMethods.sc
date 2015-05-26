package lecture5_1

object practiceListMethods {


def last[T](l: List[T]) : T = l match
{
	case (x::Nil) => x
	case (x::y) => last(y)
}                                                 //> last: [T](l: List[T])T


def init[T](l:List[T]) : List[T] = l match
{
	case List(x) => List()
	case (x::y) => x :: init(y)
}                                                 //> init: [T](l: List[T])List[T]



def take[T](n: Int, l: List[T]): List[T] =
{
	if (n >= l.length) l
	else take(n, init(l))
}                                                 //> take: [T](n: Int, l: List[T])List[T]



 val l1 = List("Hope", "you", "die", "in", "hell")//> l1  : List[String] = List(Hope, you, die, in, hell)
 last(l1)                                         //> res0: String = hell

init(l1)                                          //> res1: List[String] = List(Hope, you, die, in)
take(2, l1)                                       //> res2: List[String] = List(Hope, you)

}