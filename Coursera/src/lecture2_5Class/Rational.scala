package lecture2_5Class

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