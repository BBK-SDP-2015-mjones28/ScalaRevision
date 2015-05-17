package lecture1_6

object practice {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(1100); 

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
    };System.out.println("""sqrt: (x: Double)Double""");$skip(9); val res$0 = 

sqrt(2);System.out.println("""res0: Double = """ + $show(res$0));$skip(11); val res$1 = 
sqrt(1e60);System.out.println("""res1: Double = """ + $show(res$1))}

}
