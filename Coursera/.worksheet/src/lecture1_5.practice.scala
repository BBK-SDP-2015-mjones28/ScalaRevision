package lecture1_5

object practice {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(247); 

//compute square root - using newtons law - successive approximation

//start with an estimate value - repeatedly improve the estimate by
//taking mean of y and x/y

def abs (x: Double) = if (x < 0) -x else x;System.out.println("""abs: (x: Double)Double""");$skip(135); 

def sqrtItr(guess: Double, x: Double) : Double =
{
	if (isGoodEnough(guess, x)) guess
	else
	{
			sqrtItr(improve(guess, x) , x)
	}
};System.out.println("""sqrtItr: (guess: Double, x: Double)Double""");$skip(146); 

//whether we stop or continue
//current quess close enough
def isGoodEnough(guess: Double, x: Double) =
{
		abs(guess * guess - x) / x < 0.001
};System.out.println("""isGoodEnough: (guess: Double, x: Double)Boolean""");$skip(82); 

def improve (guess: Double, x: Double) = {
	//average
	(guess + x / guess) / 2
};System.out.println("""improve: (guess: Double, x: Double)Double""");$skip(40); 

def sqrt(x: Double) = sqrtItr(1.0 , x);System.out.println("""sqrt: (x: Double)Double""");$skip(9); val res$0 = 

sqrt(2);System.out.println("""res0: Double = """ + $show(res$0));$skip(11); val res$1 = 
sqrt(0.01);System.out.println("""res1: Double = """ + $show(res$1));$skip(11); val res$2 = 
sqrt(1e60);System.out.println("""res2: Double = """ + $show(res$2))}
}
