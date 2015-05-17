package lecture2_5






object practice_FuncsandData {

val x = new Rational(1,3)                         //> x  : lecture2_5.Rational = 1/3
x.numer                                           //> res0: Int = 1
x.denom                                           //> res1: Int = 3

val y = new Rational(5,7)                         //> y  : lecture2_5.Rational = 5/7
x.add(y)                                          //> res2: lecture2_5.Rational = 22/21

val z = new Rational(3,2)                         //> z  : lecture2_5.Rational = 3/2

x.sub(y).sub(z)                                   //> res3: lecture2_5.Rational = -79/42

}


class Rational(x:Int, y: Int)
{
	def numer = x
	def denom = y
	def add(rat: Rational): Rational =
	{
		new Rational(numer * rat.denom + rat.numer * denom, denom * rat.denom)
	}
	
	override def toString = numer + "/" + denom
	
	
	def neg: Rational  = new Rational(-numer, denom)
	
	def sub(rat: Rational) =
	{
		//new Rational(numer * rat.denom - (rat.numer * denom), denom * rat.denom)
		add(rat.neg)
	}
}