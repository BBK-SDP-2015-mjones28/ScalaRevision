package lecture6_1

object Ast1 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(412); 
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
    };System.out.println("""mkString: (args: Seq[lecture6_1.EvaluationTree], str: String)String""");$skip(158); 

  def printATree(et: EvaluationTree): String = et match {
    case Term(i) => i.toString
    case Function(str, args) => "(" + mkString(args, str) + ")"
  };System.out.println("""printATree: (et: lecture6_1.EvaluationTree)String""");$skip(99); 

  println(printATree(Function("+", Seq(Term(2), Function("*", Seq(Term(3), Term(5), Term(6)))))));$skip(210); 
        
        
   def convert(s: String, xs: Seq[EvaluationTree]) : String = xs match
   {
   		case Nil => " "
   		case h:: Nil => printTree(h)
   		case h::t => printTree(h) + s + convert(s,t)
   		
   };System.out.println("""convert: (s: String, xs: Seq[lecture6_1.EvaluationTree])String""");$skip(158); 
        
  def printTree(s: EvaluationTree): String = s match
  {
  	case Term(i) => i.toString
  	case Function(s, args) => "(" + convert(s, args) + ")"
  };System.out.println("""printTree: (s: lecture6_1.EvaluationTree)String""");$skip(181); 
  
    def eval(expr: EvaluationTree): Int = expr match {
    case Term(n) => n
    case Sum(ex1, ex2) => eval(ex1) + eval(ex2)
    case Prod(ex1, ex2) => eval(ex1) * eval(ex2)
  };System.out.println("""eval: (expr: lecture6_1.EvaluationTree)Int""");$skip(110); val res$0 = 
  
        
        
  printTree(Function("+", Seq(Term(2), Function("*", Seq(Term(3), Term(5), Term(6))))));System.out.println("""res0: String = """ + $show(res$0));$skip(57); 
  
  println(eval(Sum(Term(2), Prod(Term(3), Term(5)))))}
  
}

sealed trait EvaluationTree
final case class Term(i: Int) extends EvaluationTree
final case class Function(s: String, args: Seq[EvaluationTree]) extends EvaluationTree
final case class Sum(l: EvaluationTree, r: EvaluationTree) extends EvaluationTree
final case class Prod(l: EvaluationTree, r: EvaluationTree) extends EvaluationTree
