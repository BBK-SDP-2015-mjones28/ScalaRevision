package lecture6_6

object Trees {


 def eval(xs: Tree, env: Environment) : Int = xs match
 {
 	case Sum(l,r) => eval(l, env) + eval(r, env)
 	case Const(n) => n
 	case Var(x) => env(x)
 	case Prod(l,r) => eval(l, env) * eval(r,env)
 }                                                //> eval: (xs: lecture6_6.Tree, env: lecture6_6.Trees.Environment)Int
 
  
 
 def show(xs: Tree, env: Environment): String = xs match
 {
 		case Const(h) => h.toString
 		case Var(x) => env(x).toString
 		case Sum(l,r) => show(l, env) + " + " + show(r, env)
 		case Prod(e,Sum(l,r)) => show(e, env) + " * " + "(" + show(Sum(l,r), env) + ")"
 		case Prod(Sum(l,r), e) => "(" + show(Sum(l,r), env) + ")" + " * "+ show(e,env)
 }                                                //> show: (xs: lecture6_6.Tree, env: lecture6_6.Trees.Environment)String
 
  
 type Environment = String => Int
 val env: Environment = { case "x" => 5 case "y" => 6}
                                                  //> env  : lecture6_6.Trees.Environment = <function1>
 eval(Sum(Const(1), Const(3)), env)               //> res0: Int = 4
 eval(Sum(Sum(Const(10), Var("x")), Const(9)), env)
                                                  //> res1: Int = 24
 show(Sum(Sum(Const(10), Var("x")), Const(9)), env)
                                                  //> res2: String = 10 + 5 + 9
 show(Prod(Sum(Const(10), Var("x")), Const(9)), env)
                                                  //> res3: String = (10 + 5) * 9
                                                  
  eval(Prod(Sum(Const(10), Var("x")), Const(9)), env)
                                                  //> res4: Int = 135
}

sealed trait Tree
case class Sum(l: Tree, r: Tree) extends Tree
case class Var (n: String) extends Tree
case class Const(v: Int) extends Tree
case class Prod(l: Tree, r: Tree) extends Tree