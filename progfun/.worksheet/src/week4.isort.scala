package week4

object isort {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(152); 
  def isort(xs: List[Int]): List[Int] = xs match {
    case List()  => List()
    case y :: ys => insert(y, isort(ys))
  };System.out.println("""isort: (xs: week4.List[Int])week4.List[Int]""");$skip(113); 

  def insert(x: Int, xs: List[Int]): List[Int] = xs match {
    case List()  => ???
    case y :: ys => ???
  };System.out.println("""insert: (x: Int, xs: week4.List[Int])week4.List[Int]""")}
}
