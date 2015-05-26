package lecture6_1

object collections {
 
 
 def isPrime(n: Int) : Boolean =
 (2 until n) forall (d => n % d != 0)             //> isPrime: (n: Int)Boolean
 
 
 isPrime(25)                                      //> res0: Boolean = false
 isPrime(13)                                      //> res1: Boolean = true
}