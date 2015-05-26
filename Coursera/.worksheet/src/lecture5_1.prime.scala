package lecture5_1

object prime {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(231); 

  def isPrime(n: Int): Boolean =
  {
   def loop (acc: Int): Boolean =
	 {
	 			println(acc)
	  		if(acc == 1) true
	  		else if (n % acc == 0) false
	  		else loop(acc - 1)
	  }
	  loop(n-1)
  };System.out.println("""isPrime: (n: Int)Boolean""");$skip(160); 
  
 def isPrimeList(l: List[Int]): Boolean =
 {
		val res = l.filter(x => x % 2 != 0 || x <= 2)
		println(res)
		if (res.length == l.length) true else false
 };System.out.println("""isPrimeList: (l: List[Int])Boolean""");$skip(18); val res$0 = 

  

  isPrime(7);System.out.println("""res0: Boolean = """ + $show(res$0));$skip(303); val res$1 = 
  
  
  isPrimeList(List(1,2, 3, 4, 5,6, 7,8,9, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103, 107, 109, 113, 127, 131, 137, 139, 149, 151, 157, 163, 167, 173, 179, 181, 191, 193, 197, 199, 211, 223, 227, 229, 233, 239, 241, 251, 257, 263, 269, 271, 277));System.out.println("""res1: Boolean = """ + $show(res$1))}
          
  
 }
