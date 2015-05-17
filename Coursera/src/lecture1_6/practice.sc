package lecture1_6

object practice {

/*
  def sqrt(x: Double): Double =
    {
      def sqrtItr(guess: Double, x: Double): Double =
        {
          if (isGoodEnough(guess, x)) guess
          else {
            sqrtItr(improve(guess, x), x)
          }
        }
      def isGoodEnough(guess: Double, x: Double): Boolean =
        {
          abs(guess * guess - x) / x < 0.001
        }
      def abs(x: Double) = if (x < 0) -x else x

      //mean
      def improve(guess: Double, x: Double): Double =
        {
          (guess + x / guess) / 2
        }
      sqrtItr(1, x)
    }
*/


  def sqrt(x: Double): Double =
    {
      def sqrtItr(guess: Double): Double =
        {
          if (isGoodEnough(guess)) guess
          else {
            sqrtItr(improve(guess))
          }
        }
      def isGoodEnough(guess: Double): Boolean =
        {
          abs(guess * guess - x) / x < 0.001
        }
      def abs(x: Double) = if (x < 0) -x else x

      //mean
      def improve(guess: Double): Double =
        {
          (guess + x / guess) / 2
        }
      sqrtItr(1.0)
    }                                             //> sqrt: (x: Double)Double

sqrt(2)                                           //> res0: Double = 1.4142156862745097
sqrt(1e60)                                        //> res1: Double = 1.0000788456669446E30

}