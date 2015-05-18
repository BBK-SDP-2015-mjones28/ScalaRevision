package lecture3_3

trait List[T] {

  def isEmpty: Boolean
  def head: T
  def tail: List[T]
 // def nth(x: Int, l: List[T]) : T
}


class Cons[T](val head: T, val tail: List[T]) extends List[T]
{
   def isEmpty = false
   
   //val head = _head
   //val tail = _tail // these are implied via the class parameters


}

class Nil[T] extends List[T]
{
  def isEmpty = true
  def head: Nothing = throw new NoSuchElementException ("No head element found")
  def tail: Nothing = throw new NoSuchElementException ("No tail element found")
  def nth(x: Int, l: List[T]) : T = throw new NoSuchElementException ("No such element found")
}



