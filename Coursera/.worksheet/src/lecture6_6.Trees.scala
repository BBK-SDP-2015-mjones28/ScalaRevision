package lecture6_6

object Trees {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(236); 


 def eval(xs: Tree, env: Environment) : Int = xs match
 {
 	case Sum(l,r) => eval(l, env) + eval(r, env)
 	case Const(n) => n
 	case Var(x) => env(x)
 	case Prod(l,r) => eval(l, env) * eval(r,env)
 };System.out.println("""eval: (xs: lecture6_6.Tree, env: lecture6_6.Trees.Environment)Int""");$skip(356); 
 
  
 
 def show(xs: Tree, env: Environment): String = xs match
 {
 		case Const(h) => h.toString
 		case Var(x) => env(x).toString
 		case Sum(l,r) => show(l, env) + " + " + show(r, env)
 		case Prod(e,Sum(l,r)) => show(e, env) + " * " + "(" + show(Sum(l,r), env) + ")"
 		case Prod(Sum(l,r), e) => "(" + show(Sum(l,r), env) + ")" + " * "+ show(e,env)
 }
 
  
 type Environment = String => Int;System.out.println("""show: (xs: lecture6_6.Tree, env: lecture6_6.Trees.Environment)String""");$skip(94); 
 val env: Environment = { case "x" => 5 case "y" => 6};System.out.println("""env  : lecture6_6.Trees.Environment = """ + $show(env ));$skip(36); val res$0 = 
 eval(Sum(Const(1), Const(3)), env);System.out.println("""res0: Int = """ + $show(res$0));$skip(52); val res$1 = 
 eval(Sum(Sum(Const(10), Var("x")), Const(9)), env);System.out.println("""res1: Int = """ + $show(res$1));$skip(52); val res$2 = 
 show(Sum(Sum(Const(10), Var("x")), Const(9)), env);System.out.println("""res2: String = """ + $show(res$2));$skip(53); val res$3 = 
 show(Prod(Sum(Const(10), Var("x")), Const(9)), env);System.out.println("""res3: String = """ + $show(res$3));$skip(105); val res$4 = 
                                                  
  eval(Prod(Sum(Const(10), Var("x")), Const(9)), env);System.out.println("""res4: Int = """ + $show(res$4))}
}

sealed trait Tree
case class Sum(l: Tree, r: Tree) extends Tree
case class Var (n: String) extends Tree
case class Const(v: Int) extends Tree
case class Prod(l: Tree, r: Tree) extends Tree
