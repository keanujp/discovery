package week2

object rationals {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(61); 
	val x = new Rational(1, 2);System.out.println("""x  : week2.Rational = """ + $show(x ));$skip(9); val res$0 = 
	x.numer;System.out.println("""res0: Int = """ + $show(res$0));$skip(9); val res$1 = 
	x.denom;System.out.println("""res1: Int = """ + $show(res$1));$skip(30); 
	
	val y = new Rational(2, 3);System.out.println("""y  : week2.Rational = """ + $show(y ));$skip(10); val res$2 = 
	x.add(y)

  type Set = Int => Boolean;System.out.println("""res2: week2.Rational = """ + $show(res$2));$skip(82); 
  def contains(s: Set, elem: Int): Boolean = s(elem);System.out.println("""contains: (s: week2.rationals.Set, elem: Int)Boolean""")}
}

class Rational(x: Int, y: Int) {
  def numer = x
  def denom = y
  
  def add(that: Rational) =
  	new Rational(
  	numer * that.denom + that.numer * denom,
  	denom * that.denom)
  	
  override def toString = numer + "/" + denom
}
