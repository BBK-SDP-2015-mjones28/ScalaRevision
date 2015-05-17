package lecture2_7

object practice_EvalandOps {

val x = new Rational(1,3)                         //> x  : lecture2_7.Rational = 1/3
val y = new Rational(5,7)                         //> y  : lecture2_7.Rational = 5/7
val z = new Rational(3,2)                         //> z  : lecture2_7.Rational = 3/2

//x.add(y)
//x add y
x + y                                             //> res0: lecture2_7.Rational = 22/21
x.+(y)                                            //> res1: lecture2_7.Rational = 22/21
x - y - z                                         //> res2: lecture2_7.Rational = -79/42
}


class Rational(x:Int, y: Int)
{
 require(y != 0, "Denominator must not be Zero")
 
 //constructor with single argument - calls constructor with two arguments - part of the original make up
 def this(x: Int) = this(x,1)
 
	private def gcd(a: Int, b: Int): Int =
	{
		if (b==0) a else gcd(b, a % b)
	}
	
	//val g = gcd(x,y)
	def numer = x // / g  - unsimplified without the division
	def denom = y // / g
	
	//def add(rat: Rational): Rational =
	def + (rat: Rational): Rational =
	{
		new Rational(numer * rat.denom + rat.numer * denom, denom * rat.denom)
	}
	
	override def toString =
	{
	val g = gcd(x,y)
	numer/g + "/" + denom/g
	}
		
	//def neg: Rational  = new Rational(-numer, denom)
		def unary_- : Rational  = new Rational(-numer, denom)
	
	//def sub(rat: Rational) =
	def - (rat: Rational) =
	{
		//new Rational(numer * rat.denom - (rat.numer * denom), denom * rat.denom)
		//this + (rat.neg)
		this + -rat
	}
	//on rational less than another
	//def less(rat: Rational) : Boolean =
	def < (rat: Rational) : Boolean =
	{
		numer * rat.denom <  rat.numer * denom
	}

	//max value of two rationals
	def max(rat: Rational) : Rational =
	{
		if (this < (rat)) rat else this
	}
}