package lecture3_1

object practice_ClassHire {

val t1 = new NonEmpty(3, new Empty, new Empty)    //> t1  : lecture3_1.NonEmpty = {.3.}
val t2 = t1 incl 4                                //> t2  : lecture3_1.IntSet = {.3{.4.}}


}

abstract class IntSet
{
	def incl(x: Int): IntSet
	def contains(x: Int): Boolean

}

class Empty extends IntSet
{
	def incl(x: Int): IntSet = new NonEmpty(x, new Empty, new Empty)
	def contains(x: Int): Boolean = false //always false as empty
	
	override def toString = "."
}

class NonEmpty (elem: Int, left: IntSet, right: IntSet) extends IntSet
{
	def incl(x: Int): IntSet =
	{
		if (x < elem) new NonEmpty(elem, left incl x, right)
		else if (x > elem) new NonEmpty (elem, left, right incl x)
		else this	 //neither left or right - therefore found element
	}
	
	//recursive search
	def contains(x: Int): Boolean =
	{
		if( x < elem) left contains x
		else if (x > elem) right contains x
		else true
	}

	override def toString = "{" + left + elem + right + "}"
}