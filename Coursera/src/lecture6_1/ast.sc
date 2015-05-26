package lecture6_1

object Ast1 {
/*
	def eval(xs: Express): Int = xs match
	{
		 //case Numb(n) => n
		 case Funcs("+", args) =>  args map ((x , y) => x * y)
		 //case Funcs("*", args) =>
	}
	
*/



  def mkString(args: Seq[EvaluationTree], str: String): String =
    args match {
      case Nil => " "
      case s :: Nil => printATree(s)
      case h :: tail => printATree(h) + str + mkString(tail, str)
    }                                             //> mkString: (args: Seq[lecture6_1.EvaluationTree], str: String)String

  def printATree(et: EvaluationTree): String = et match {
    case Term(i) => i.toString
    case Function(str, args) => "(" + mkString(args, str) + ")"
  }                                               //> printATree: (et: lecture6_1.EvaluationTree)String

  println(printATree(Function("+", Seq(Term(2), Function("*", Seq(Term(3), Term(5), Term(6)))))))
                                                  //> (2+(3*5*6))
        
        
   def convert(s: String, xs: Seq[EvaluationTree]) : String = xs match
   {
   		case Nil => " "
   		case h:: Nil => printTree(h)
   		case h::t => printTree(h) + s + convert(s,t)
   		
   }                                              //> convert: (s: String, xs: Seq[lecture6_1.EvaluationTree])String
        
  def printTree(s: EvaluationTree): String = s match
  {
  	case Term(i) => i.toString
  	case Function(s, args) => "(" + convert(s, args) + ")"
  }                                               //> printTree: (s: lecture6_1.EvaluationTree)String
  
    def eval(expr: EvaluationTree): Int = expr match {
    case Term(n) => n
    case Sum(ex1, ex2) => eval(ex1) + eval(ex2)
    case Prod(ex1, ex2) => eval(ex1) * eval(ex2)
  }                                               //> eval: (expr: lecture6_1.EvaluationTree)Int
  
        
        
  printTree(Function("+", Seq(Term(2), Function("*", Seq(Term(3), Term(5), Term(6))))))
                                                  //> res0: String = (2+(3*5*6))
  
  println(eval(Sum(Term(2), Prod(Term(3), Term(5)))))
                                                  //> 17
  
}

sealed trait EvaluationTree
final case class Term(i: Int) extends EvaluationTree
final case class Function(s: String, args: Seq[EvaluationTree]) extends EvaluationTree
final case class Sum(l: EvaluationTree, r: EvaluationTree) extends EvaluationTree
final case class Prod(l: EvaluationTree, r: EvaluationTree) extends EvaluationTree