package lecture1_4

object practice {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(81); 
  println("Welcome to the Scala worksheet");$skip(66); 
  
  
  def loop: Boolean = loop;System.out.println("""loop: => Boolean""");$skip(146);      //ok not evaluated until use
  
 // val x = loop  right handside is evaluate instantly and thus infinite loop
  
  
  def and(x: Boolean, y: => Boolean) = if (x) y else false;System.out.println("""and: (x: Boolean, y: => Boolean)Boolean""");$skip(54); 
  
  def or(x: Boolean, y: Boolean) = if (x) x else y;System.out.println("""or: (x: Boolean, y: Boolean)Boolean""");$skip(25); val res$0 = 
  
  
  and(true, false);System.out.println("""res0: Boolean = """ + $show(res$0));$skip(18); val res$1 = 
  or(true, false);System.out.println("""res1: Boolean = """ + $show(res$1))}
  
  // and(false, loop) // causes an error unless x: => Boolean
  
}
