package lecture1_4

object practice {
  println("Welcome to the Scala worksheet")
  
  
  def loop: Boolean = loop     //ok not evaluated until use
  
 // val x = loop  right handside is evaluate instantly and thus infinite loop
  
  
  def and(x: Boolean, y: => Boolean) = if (x) y else false
  
  def or(x: Boolean, y: Boolean) = if (x) x else y
  
  
  and(true, false)
  or(true, false)
  
  // and(false, loop) // causes an error unless x: => Boolean
  
}