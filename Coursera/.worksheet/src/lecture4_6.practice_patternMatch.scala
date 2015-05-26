package lecture4_6

object practice_patternMatch {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(188); 

	def eval(ex: Exp): Int = ex match
	{
		case Add(l, r) => eval(l) + eval(r)
		case Prod(l, r) => eval(l) * eval(r)
		case Num(n) => n
	};System.out.println("""eval: (ex: lecture4_6.Exp)Int""");$skip(93); 
	
	def listEval(ex: Exp): Int = ex match
	{
		case Add(Nums(l),Nums(r)) => Nums(l) + u
		
	};System.out.println("""listEval: (ex: lecture4_6.Exp)Int""");$skip(328); 
	
	
	def show(ex: Exp) : String = ex match
	{
		case Add(l,r) => show(l) + " + " + show(r)
		case Prod(ex, Add(l,r)) => show(ex) + " * " + "(" + show(Add(l,r)) + ")"
		case Prod(Add(l,r), ex) => "(" + show(Add(l,r)) + ")" + " * " + show(ex)
		case Prod(ex1, ex2) => show(ex1) + " * " + show(ex2)
		case Num(n) =>  n.toString
	};System.out.println("""show: (ex: lecture4_6.Exp)String""");$skip(42); val res$0 = 


show(Prod(Add(Num(3),Num(4)), Num(10)));System.out.println("""res0: String = """ + $show(res$0));$skip(40); val res$1 = 
eval(Prod(Add(Num(3),Num(4)), Num(10)));System.out.println("""res1: Int = """ + $show(res$1))}

}


sealed trait Exp
final case class Num (n: Int) extends Exp
final case class Nums (l: List[Int]) extends Exp
final case class Add(l: Exp, r: Exp) extends Exp
final case class Prod(l: Exp, r: Exp) extends Exp
