package section6

class Rational(n: Int, d: Int) {
  println("Created " + n + "/" + d)
}

object rational {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(151); 
  println("Welcome to the Scala worksheet");$skip(21); val res$0 = 
  new Rational(1, 2);System.out.println("""res0: section6.Rational = """ + $show(res$0))}
}
