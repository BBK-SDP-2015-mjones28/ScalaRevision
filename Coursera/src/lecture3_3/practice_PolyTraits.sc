package lecture3_3

object practice_PolyTraits {


     def nth[T](x: Int, l: List[T]) : T =
     {
     		if (l.isEmpty) throw new IndexOutOfBoundsException
        if (x == 0) l.head
        else nth(x - 1, l.tail)
     }                                            //> nth: [T](x: Int, l: lecture3_3.List[T])T

    val list = new Cons(1, new Cons(2, new Cons(3, new Nil)))
                                                  //> list  : lecture3_3.Cons[Int] = lecture3_3.Cons@340f438e
      	nth(2, list)                              //> res0: Int = 3
      //	nth(10, list)
}