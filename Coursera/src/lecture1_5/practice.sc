package lecture1_5

object practice {

//compute square root - using newtons law - successive approximation

//start with an estimate value - repeatedly improve the estimate by
//taking mean of y and x/y

def abs (x: Double) = if (x < 0) -x else x        //> abs: (x: Double)Double

def sqrtItr(guess: Double, x: Double) : Double =
{
	if (isGoodEnough(guess, x)) guess
	else
	{
			sqrtItr(improve(guess, x) , x)
	}
}                                                 //> sqrtItr: (guess: Double, x: Double)Double

//whether we stop or continue
//current quess close enough
def isGoodEnough(guess: Double, x: Double) =
{
		abs(guess * guess - x) / x < 0.001
}                                                 //> isGoodEnough: (guess: Double, x: Double)Boolean

def improve (guess: Double, x: Double) = {
	//average
	(guess + x / guess) / 2
}                                                 //> improve: (guess: Double, x: Double)Double

def sqrt(x: Double) = sqrtItr(1.0 , x)            //> sqrt: (x: Double)Double

sqrt(2)                                           //> res0: Double = 1.4142156862745097
sqrt(0.01)                                        //> res1: Double = 0.10000052895642693
sqrt(1e60)                                        //> res2: Double = 1.0000788456669446E30
}