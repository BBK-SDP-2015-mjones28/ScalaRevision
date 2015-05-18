package lecture3_2

object practice_trait {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(93); 

//nothing covered

 val t: Travel = new Travel();System.out.println("""t  : lecture3_2.Travel = """ + $show(t ));$skip(20); 
 t setV(new Bike());$skip(13); 
 t onTheMove}

}

trait Vehicle
{
	def move(): Unit
}

class Car extends Vehicle
{
	def move() : Unit ="brum - brum"
}

class Bike extends Vehicle
{
	def move(): Unit = "ding - ding"
}

class Travel
{
	var v: Vehicle
	
	def setV(v: Vehicle)
	{
		this.v = v
	}
	
	def onTheMove() : Unit =
	{
		val a = v move()
		println(a)
	}

}
