package lecture3_1

object practiceRepeat {

val t1 = new NonEmptyTree (5, new EmptyTree, new EmptyTree)
                                                  //> t1  : lecture3_1.NonEmptyTree = {.5.}
val t2 = t1 place 2                               //> t2  : lecture3_1.IntTree = {{.2.}5.}
val t4 = t2 place 8                               //> t4  : lecture3_1.IntTree = {{.2.}5{.8.}}
val t5 = t4 place 3                               //> t5  : lecture3_1.IntTree = {{.2{.3.}}5{.8.}}


 t4 contains (5)                                  //> res0: Boolean = true
 
 
 val t6 = new NonEmptyTree (9, new EmptyTree, new EmptyTree)
                                                  //> t6  : lecture3_1.NonEmptyTree = {.9.}
 val t7 = t6 place 13                             //> t7  : lecture3_1.IntTree = {.9{.13.}}
 val t8 = t7 place 11                             //> t8  : lecture3_1.IntTree = {.9{{.11.}13.}}
 
t8 union t5                                       //> res1: lecture3_1.IntTree = {{.2{.3.}}5{.8{{.9.}11{.13.}}}}
}


abstract class IntTree
{
	 def place(x: Int) : IntTree
	 def contains(x: Int) : Boolean
	 def union(other: IntTree): IntTree
}


class EmptyTree extends IntTree
{
	def place(x: Int) = new NonEmptyTree (x, new EmptyTree, new EmptyTree)
	def contains(x: Int): Boolean = false
  def union(other: IntTree): IntTree = other
	override def toString = "."
}


class NonEmptyTree (current: Int, left: IntTree, right: IntTree) extends IntTree
{

	def place(x: Int): IntTree =
	{
		if (x < current) new NonEmptyTree (current, left place x, right)
		else if (x > current) new NonEmptyTree (current, left, right place x)
		else this
	}

	def contains(x: Int): Boolean =
	{
		if (x < current) left contains x
		else if (x > current) right contains x
		else true
	}
	
	
	 def union(other: IntTree): IntTree =
	 {
	 		((left union right) union other) place current
	 }
	
	override def toString = "{" + left + current + right + "}"
}