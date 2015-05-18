package lecture3_2

object practice_trait {

//nothing covered

 val t: Travel = new Travel()
 t setV(new Bike())
 t onTheMove

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