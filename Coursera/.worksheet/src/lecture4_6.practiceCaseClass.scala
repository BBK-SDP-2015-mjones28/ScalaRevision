package lecture4_6

object practiceCaseClass {

type Environment = String => Int;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(137); 


val env: Environment = { case "x" => 5 case "y" => 7 };System.out.println("""env  : lecture4_6.practiceCaseClass.Environment = """ + $show(env ));$skip(164); 

def eval(e: Expr): Int = e match
{
	case Number(n) => n
	case Sum(e1, e2) => eval(e1) + eval(e2)
	case Product(l, r) => eval(l) * eval(r)
	case Var(v) => env(v)
};System.out.println("""eval: (e: lecture4_6.Expr)Int""");$skip(832); 

/*
def show1(e: Expr): String = e match
{
	case Number(n) => n.toString
	case Sum(l,r) => "(" + show(l) + " + " + show(r) + ")"
	case Product(l, r) => "(" + show(l) + " * " + show(r) + ")"
	case Var(v) => v
	case If(f) => "If " + show(f)
	//case lessThan(l, r) => if ((eval(l).toInt) < (eval(r).toInt)) "true" else "false"
	case lessThan(l, r) => "(" + show(l) + " < " + show(r) + ")"
	case greaterThan(l, r) => "(" + show(l) + " > " + show(r) + ")"

}
*/

def show(e: Expr): String =
  e match {
    case Number(n) => n.toString
    case Sum(e1, e2) => show(e1) + " + " + show(e2)
    case Product(Sum(s1, s2), e2) => "(" + show(Sum(s1, s2)) + ") * " + show(e2)
    case Product(e1, Sum(s1, s2)) => show(e1) + " * (" + show(Sum(s1, s2)) + ")"
    case Product(e1, e2) => show(e1) + " * " + show(e2)
    case Var(name) => name
  };System.out.println("""show: (e: lecture4_6.Expr)String""");$skip(43); val res$0 = 
  
  
  

show(Sum(Number(1), Number(2)));System.out.println("""res0: String = """ + $show(res$0));$skip(36); val res$1 = 
show(Product(Number(3), Number(2)));System.out.println("""res1: String = """ + $show(res$1));$skip(52); val res$2 = 
show(Product(Sum(Number(3), Number(4)), Number(6)));System.out.println("""res2: String = """ + $show(res$2));$skip(51); val res$3 = 
show(Sum(Number(5),Product(Number(3), Number(4))));System.out.println("""res3: String = """ + $show(res$3));$skip(33); val res$4 = 

eval(Sum(Number(2), Number(4)));System.out.println("""res4: Int = """ + $show(res$4));$skip(36); val res$5 = 
eval(Product(Number(2), Number(4)));System.out.println("""res5: Int = """ + $show(res$5));$skip(50); val res$6 = 
eval(Product(Sum(Number(2), Var("x")), Var("y")));System.out.println("""res6: Int = """ + $show(res$6));$skip(50); val res$7 = 
show(Product(Sum(Number(2), Var("x")), Var("y")));System.out.println("""res7: String = """ + $show(res$7));$skip(67); val res$8 = 
show(Product(Sum(Number(5), Number(4)), Sum(Number(3), Var("x"))));System.out.println("""res8: String = """ + $show(res$8));$skip(75); val res$9 = 
show(Product(Product(Number(5), Number(4)), Product(Number(3), Var("x"))));System.out.println("""res9: String = """ + $show(res$9));$skip(248); 
//show(lessThan(Number(2), Number(4)))




//////////////////////////////
//Keiths crappy example
def printf(e: EvaluationTree)  = e match {
   case Term(i) => i.toString
   case Func(s, args) =>  "Func(" + s + ", " + printThing(args, ",") + ")"
};System.out.println("""printf: (e: lecture4_6.EvaluationTree)String""");$skip(212); 

def printThing(thing: Seq[EvaluationTree], separator: String): String = thing match {
   case Nil => " "
   case s :: Nil => printf(s)
   case hd :: tl => printf(hd) + separator + printThing(tl, separator)
   };System.out.println("""printThing: (thing: Seq[lecture4_6.EvaluationTree], separator: String)String""");$skip(70); 
        
val sequ: EvaluationTree = Func("sum", Seq(Term(1),Term(2)));System.out.println("""sequ  : lecture4_6.EvaluationTree = """ + $show(sequ ));$skip(16); val res$10 = 
 
printf(sequ);System.out.println("""res10: String = """ + $show(res$10))}
///////////////////////////////////////////
}



trait Expr
case class Number(n: Int) extends Expr
case class Sum(l: Expr, r: Expr) extends Expr
case class Product(l: Expr, r: Expr) extends Expr
case class Var(v: String) extends Expr
case class lessThan(n1: Number, n2: Number) extends Expr
case class If(f : Expr) extends Expr
case class greaterThan(n1: Number, n2: Number) extends Expr




//////////////////////////////
//Keiths crappy example
sealed trait EvaluationTree
final case class Term(i: Int) extends EvaluationTree
final case class Func(s: String, args: Seq[EvaluationTree]) extends EvaluationTree
///////////////////////////////////
