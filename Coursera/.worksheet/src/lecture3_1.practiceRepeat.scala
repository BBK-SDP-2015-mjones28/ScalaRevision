package lecture3_1

object practiceRepeat {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(104); 

val t1 = new NonEmptyTree (5, new EmptyTree, new EmptyTree);System.out.println("""t1  : lecture3_1.NonEmptyTree = """ + $show(t1 ));$skip(20); 
val t2 = t1 place 2;System.out.println("""t2  : lecture3_1.IntTree = """ + $show(t2 ));$skip(20); 
val t4 = t2 place 8;System.out.println("""t4  : lecture3_1.IntTree = """ + $show(t4 ));$skip(20); 
val t5 = t4 place 3;System.out.println("""t5  : lecture3_1.IntTree = """ + $show(t5 ));$skip(19); val res$0 = 


 t4 contains (5);System.out.println("""res0: Boolean = """ + $show(res$0));$skip(65); 
 
 
 val t6 = new NonEmptyTree (9, new EmptyTree, new EmptyTree);System.out.println("""t6  : lecture3_1.NonEmptyTree = """ + $show(t6 ));$skip(22); 
 val t7 = t6 place 13;System.out.println("""t7  : lecture3_1.IntTree = """ + $show(t7 ));$skip(22); 
 val t8 = t7 place 11;System.out.println("""t8  : lecture3_1.IntTree = """ + $show(t8 ));$skip(14); val res$1 = 
 
t8 union t5;System.out.println("""res1: lecture3_1.IntTree = """ + $show(res$1))}
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
