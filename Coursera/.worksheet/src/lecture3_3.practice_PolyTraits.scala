package lecture3_3

object practice_PolyTraits {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(223); 


     def nth[T](x: Int, l: List[T]) : T =
     {
     		if (l.isEmpty) throw new IndexOutOfBoundsException
        if (x == 0) l.head
        else nth(x - 1, l.tail)
     };System.out.println("""nth: [T](x: Int, l: lecture3_3.List[T])T""");$skip(63); 

    val list = new Cons(1, new Cons(2, new Cons(3, new Nil)));System.out.println("""list  : lecture3_3.Cons[Int] = """ + $show(list ));$skip(20); val res$0 = 
      	nth(2, list);System.out.println("""res0: Int = """ + $show(res$0))}
      //	nth(10, list)
}
