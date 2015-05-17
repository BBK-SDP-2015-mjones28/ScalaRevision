package lecture2_5






object practice_FuncsandData {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(82); 

val x = new Rational(1,3);System.out.println("""x  : lecture2_5.Rational = """ + $show(x ));$skip(8); val res$0 = 
x.numer;System.out.println("""res0: Int = """ + $show(res$0));$skip(8); val res$1 = 
x.denom;System.out.println("""res1: Int = """ + $show(res$1));$skip(27); 

val y = new Rational(5,7);System.out.println("""y  : lecture2_5.Rational = """ + $show(y ));$skip(9); val res$2 = 
x.add(y);System.out.println("""res2: lecture2_5.Rational = """ + $show(res$2));$skip(27); 

val z = new Rational(3,2);System.out.println("""z  : lecture2_5.Rational = """ + $show(z ));$skip(17); val res$3 = 

x.sub(y).sub(z);System.out.println("""res3: lecture2_5.Rational = """ + $show(res$3))}

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
