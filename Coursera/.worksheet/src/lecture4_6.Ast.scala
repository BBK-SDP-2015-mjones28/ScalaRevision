package lecture4_6

object Ast {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(267); 

  def show(e: Expr): String = e match {
  	case Number1(x) => x.toString
  	case Sum1(left, right) => show(left) + " + " + show(right)
  	case Product1(left, right) => wrap1(left) + " * " + wrap1(right)
  	case Var1(name) => name
  };System.out.println("""show: (e: lecture4_6.Expr)String""");$skip(171); 
  
  def wrap(expression: Expr): String = expression match {
  	case Sum1(left, right) => "(" + show(left) + " + " + show(right) + ")"
  	case bad => show(expression)
  };System.out.println("""wrap: (expression: lecture4_6.Expr)String""");$skip(166); 
  
  def wrap1(expression: Expr) : String = expression match
  {
    case Sum1(e1, e2) => "(" + show(e1) + " + " + show(e2) + ")"
    case e1 => show(expression)
  };System.out.println("""wrap1: (expression: lecture4_6.Expr)String""");$skip(80); val res$0 = 
  
  
show(Product1(Sum1(Number1(5), Number1(4)), Sum1(Number1(3), Var1("x"))));System.out.println("""res0: String = """ + $show(res$0));$skip(74); val res$1 = 
show(Sum1(Product1(Number1(5), Number1(4)), Sum1(Number1(3), Var1("x"))));System.out.println("""res1: String = """ + $show(res$1))}
  
}


trait Expr
case class Number1(n: Int) extends Expr
case class Sum1(l: Expr, r: Expr) extends Expr
case class Product1(l: Expr, r: Expr) extends Expr
case class Var1(v: String) extends Expr
