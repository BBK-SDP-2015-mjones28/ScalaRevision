package lecture3_3
import lecture3_3._

object nth
{
     def nth[T](x: Int, l: List[T]) : T = 
     {            
        if (x == 0) l.head
        //else if(x > l.size - 1) throw new IndexOutOfBoundsException ("value is too big - greater than size of list")
        else nth(x - 1, l.tail)        
     }  
}


object Tester extends App
{
    val list = new Cons(1, new Cons(2, new Cons(3, new Nil)))

}