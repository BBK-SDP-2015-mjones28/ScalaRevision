package lecture2_7

object practice_EvalandOps {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(75); 

val x = new Rational(1,3);System.out.println("""x  : lecture2_7.Rational = """ + $show(x ));$skip(26); 
val y = new Rational(5,7);System.out.println("""y  : lecture2_7.Rational = """ + $show(y ));$skip(26); 
val z = new Rational(3,2);System.out.println("""z  : lecture2_7.Rational = """ + $show(z ));$skip(28); val res$0 = 

//x.add(y)
//x add y
x + y;System.out.println("""res0: lecture2_7.Rational = """ + $show(res$0));$skip(7); val res$1 = 
x.+(y);System.out.println("""res1: lecture2_7.Rational = """ + $show(res$1));$skip(10); val res$2 = 
x - y - z;System.out.println("""res2: lecture2_7.Rational = """ + $show(res$2))}
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
