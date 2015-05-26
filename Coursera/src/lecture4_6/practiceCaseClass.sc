package lecture4_6

object practiceCaseClass {

type Environment = String => Int


val env: Environment = { case "x" => 5 case "y" => 7 }
                                                  //> env  : lecture4_6.practiceCaseClass.Environment = <function1>

def eval(e: Expr): Int = e match
{
	case Number(n) => n
	case Sum(e1, e2) => eval(e1) + eval(e2)
	case Product(l, r) => eval(l) * eval(r)
	case Var(v) => env(v)
}                                                 //> eval: (e: lecture4_6.Expr)Int

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
  }                                               //> show: (e: lecture4_6.Expr)String
  
  
  

show(Sum(Number(1), Number(2)))                   //> res0: String = 1 + 2
show(Product(Number(3), Number(2)))               //> res1: String = 3 * 2
show(Product(Sum(Number(3), Number(4)), Number(6)))
                                                  //> res2: String = (3 + 4) * 6
show(Sum(Number(5),Product(Number(3), Number(4))))//> res3: String = 5 + 3 * 4

eval(Sum(Number(2), Number(4)))                   //> res4: Int = 6
eval(Product(Number(2), Number(4)))               //> res5: Int = 8
eval(Product(Sum(Number(2), Var("x")), Var("y"))) //> res6: Int = 49
show(Product(Sum(Number(2), Var("x")), Var("y"))) //> res7: String = (2 + x) * y
show(Product(Sum(Number(5), Number(4)), Sum(Number(3), Var("x"))))
                                                  //> res8: String = (5 + 4) * 3 + x
show(Product(Product(Number(5), Number(4)), Product(Number(3), Var("x"))))
                                                  //> res9: String = 5 * 4 * 3 * x
//show(lessThan(Number(2), Number(4)))




//////////////////////////////
//Keiths crappy example
def printf(e: EvaluationTree)  = e match {
   case Term(i) => i.toString
   case Func(s, args) =>  "Func(" + s + ", " + printThing(args, ",") + ")"
}                                                 //> printf: (e: lecture4_6.EvaluationTree)String

def printThing(thing: Seq[EvaluationTree], separator: String): String = thing match {
   case Nil => " "
   case s :: Nil => printf(s)
   case hd :: tl => printf(hd) + separator + printThing(tl, separator)
   }                                              //> printThing: (thing: Seq[lecture4_6.EvaluationTree], separator: String)Strin
                                                  //| g
        
val sequ: EvaluationTree = Func("sum", Seq(Term(1),Term(2)))
                                                  //> sequ  : lecture4_6.EvaluationTree = Func(sum,List(Term(1), Term(2)))
 
printf(sequ)                                      //> res10: String = Func(sum, 1,2)
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