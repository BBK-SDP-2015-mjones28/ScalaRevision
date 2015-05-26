package lecture4_6

object practice_patternMatch {

	def eval(ex: Exp): Int = ex match
	{
		case Add(l, r) => eval(l) + eval(r)
		case Prod(l, r) => eval(l) * eval(r)
		case Num(n) => n
	}                                         //> eval: (ex: lecture4_6.Exp)Int
	
	def listEval(ex: Exp): Int = ex match
	{
		case Add(Nums(l),Nums(r)) => Nums(l) + u
		
	}
	
	
	def show(ex: Exp) : String = ex match
	{
		case Add(l,r) => show(l) + " + " + show(r)
		case Prod(ex, Add(l,r)) => show(ex) + " * " + "(" + show(Add(l,r)) + ")"
		case Prod(Add(l,r), ex) => "(" + show(Add(l,r)) + ")" + " * " + show(ex)
		case Prod(ex1, ex2) => show(ex1) + " * " + show(ex2)
		case Num(n) =>  n.toString
	}                                         //> show: (ex: lecture4_6.Exp)String


show(Prod(Add(Num(3),Num(4)), Num(10)))           //> res0: String = (3 + 4) * 10
eval(Prod(Add(Num(3),Num(4)), Num(10)))           //> res1: Int = 70

}


sealed trait Exp
final case class Num (n: Int) extends Exp
final case class Nums (l: List[Int]) extends Exp
final case class Add(l: Exp, r: Exp) extends Exp
final case class Prod(l: Exp, r: Exp) extends Exp