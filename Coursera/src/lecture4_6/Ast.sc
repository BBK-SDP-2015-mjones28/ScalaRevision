package lecture4_6

object Ast {

  def show(e: Expr): String = e match {
  	case Number1(x) => x.toString
  	case Sum1(left, right) => show(left) + " + " + show(right)
  	case Product1(left, right) => wrap1(left) + " * " + wrap1(right)
  	case Var1(name) => name
  }                                               //> show: (e: lecture4_6.Expr)String
  
  def wrap(expression: Expr): String = expression match {
  	case Sum1(left, right) => "(" + show(left) + " + " + show(right) + ")"
  	case bad => show(expression)
  }                                               //> wrap: (expression: lecture4_6.Expr)String
  
  def wrap1(expression: Expr) : String = expression match
  {
    case Sum1(e1, e2) => "(" + show(e1) + " + " + show(e2) + ")"
    case e1 => show(expression)
  }                                               //> wrap1: (expression: lecture4_6.Expr)String
  
  
show(Product1(Sum1(Number1(5), Number1(4)), Sum1(Number1(3), Var1("x"))))
                                                  //> res0: String = (5 + 4) * (3 + x)
show(Sum1(Product1(Number1(5), Number1(4)), Sum1(Number1(3), Var1("x"))))
                                                  //> res1: String = 5 * 4 + 3 + x
  
}


trait Expr
case class Number1(n: Int) extends Expr
case class Sum1(l: Expr, r: Expr) extends Expr
case class Product1(l: Expr, r: Expr) extends Expr
case class Var1(v: String) extends Expr