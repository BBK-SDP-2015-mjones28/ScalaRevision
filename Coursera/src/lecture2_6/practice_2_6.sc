package lecture2_6

object practice_2_6 {
val x = new Rational(1,3)                         //> x  : lecture2_6.Rational = 1/3
x.numer                                           //> res0: Int = 1
x.denom                                           //> res1: Int = 3

val y = new Rational(5,7)                         //> y  : lecture2_6.Rational = 5/7
x.add(y)                                          //> res2: lecture2_6.Rational = 22/21

val z = new Rational(3,2)                         //> z  : lecture2_6.Rational = 3/2

x.sub(y).sub(z)                                   //> res3: lecture2_6.Rational = -79/42
y.add(y)                                          //> res4: lecture2_6.Rational = 10/7
x.less(y)                                         //> res5: Boolean = true
x.max(y)                                          //> res6: lecture2_6.Rational = 5/7
y.max(x)                                          //> res7: lecture2_6.Rational = 5/7
//val strange = new Rational(1,0)  //retures a "require" error
//strange.add(strange)
val a = new Rational(2)                           //> a  : lecture2_6.Rational = 2/1
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
	def add(rat: Rational): Rational =
	{
		new Rational(numer * rat.denom + rat.numer * denom, denom * rat.denom)
	}
	
	override def toString =
	{
	val g = gcd(x,y)
	numer/g + "/" + denom/g
	}
	
	
	def neg: Rational  = new Rational(-numer, denom)
	
	def sub(rat: Rational) =
	{
		//new Rational(numer * rat.denom - (rat.numer * denom), denom * rat.denom)
		add(rat.neg)
	}
	//on rational less than another
	def less(rat: Rational) : Boolean =
	{
		numer * rat.denom <  rat.numer * denom
	}

	//max value of two rationals
	def max(rat: Rational) : Rational =
	{
		if (this.less(rat)) rat else this
	}
}