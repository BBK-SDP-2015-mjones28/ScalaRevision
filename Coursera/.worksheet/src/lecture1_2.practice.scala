package lecture1_2

object practice {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(46); val res$0 = 
  
  3+4;System.out.println("""res0: Int(7) = """ + $show(res$0));$skip(21); 
  
  def radius = 10;System.out.println("""radius: => Int""");$skip(22); 
  
  def pi = 3.14159;System.out.println("""pi: => Double""");$skip(17); val res$1 = 
  
  radius * pi;System.out.println("""res1: Double = """ + $show(res$1));$skip(35); 
  
  def square(x: Double) = x * x;System.out.println("""square: (x: Double)Double""");$skip(78); 
  
  def sumOfSquares(x: Double, y: Double) : Double = square(x) + square (y);System.out.println("""sumOfSquares: (x: Double, y: Double)Double""");$skip(25); val res$2 = 
  
  sumOfSquares(10, 5);System.out.println("""res2: Double = """ + $show(res$2))}
  
}
