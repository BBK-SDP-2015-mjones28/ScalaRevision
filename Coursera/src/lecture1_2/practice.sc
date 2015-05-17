package lecture1_2

object practice {
  
  3+4                                             //> res0: Int(7) = 7
  
  def radius = 10                                 //> radius: => Int
  
  def pi = 3.14159                                //> pi: => Double
  
  radius * pi                                     //> res1: Double = 31.4159
  
  def square(x: Double) = x * x                   //> square: (x: Double)Double
  
  def sumOfSquares(x: Double, y: Double) : Double = square(x) + square (y)
                                                  //> sumOfSquares: (x: Double, y: Double)Double
  
  sumOfSquares(10, 5)                             //> res2: Double = 125.0
  
}