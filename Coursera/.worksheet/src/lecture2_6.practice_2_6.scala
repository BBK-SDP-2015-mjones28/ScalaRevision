package lecture2_6

object practice_2_6 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(67); 
val x = new Rational(1,3);System.out.println("""x  : lecture2_6.Rational = """ + $show(x ));$skip(8); val res$0 = 
x.numer;System.out.println("""res0: Int = """ + $show(res$0));$skip(8); val res$1 = 
x.denom;System.out.println("""res1: Int = """ + $show(res$1));$skip(27); 

val y = new Rational(5,7);System.out.println("""y  : lecture2_6.Rational = """ + $show(y ));$skip(9); val res$2 = 
x.add(y);System.out.println("""res2: lecture2_6.Rational = """ + $show(res$2));$skip(27); 

val z = new Rational(3,2);System.out.println("""z  : lecture2_6.Rational = """ + $show(z ));$skip(17); val res$3 = 

x.sub(y).sub(z);System.out.println("""res3: lecture2_6.Rational = """ + $show(res$3));$skip(9); val res$4 = 
y.add(y);System.out.println("""res4: lecture2_6.Rational = """ + $show(res$4));$skip(10); val res$5 = 
x.less(y);System.out.println("""res5: Boolean = """ + $show(res$5));$skip(9); val res$6 = 
x.max(y);System.out.println("""res6: lecture2_6.Rational = """ + $show(res$6));$skip(9); val res$7 = 
y.max(x);System.out.println("""res7: lecture2_6.Rational = """ + $show(res$7));$skip(110); 
//val strange = new Rational(1,0)  //retures a "require" error
//strange.add(strange)
val a = new Rational(2);System.out.println("""a  : lecture2_6.Rational = """ + $show(a ))}
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
