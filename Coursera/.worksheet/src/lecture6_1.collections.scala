package lecture6_1

object collections {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(115); 
 
 
 def isPrime(n: Int) : Boolean =
 (2 until n) forall (d => n % d != 0);System.out.println("""isPrime: (n: Int)Boolean""");$skip(17); val res$0 = 
 
 
 isPrime(25);System.out.println("""res0: Boolean = """ + $show(res$0));$skip(13); val res$1 = 
 isPrime(13);System.out.println("""res1: Boolean = """ + $show(res$1))}
}
