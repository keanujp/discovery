package week5

object pack {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(202); 
  def pack[T](xs: List[T]): List[List[T]] = xs match {
    case Nil => Nil
    case x :: xs1 =>
      val (first, rest) = xs span (s => s == x)
      first :: pack(rest)
  };System.out.println("""pack: [T](xs: List[T])List[List[T]]""");$skip(49); val res$0 = 

  pack(List("a", "a", "a", "b", "c", "c", "a"));System.out.println("""res0: List[List[String]] = """ + $show(res$0));$skip(173); 

  def encode[T](xs: List[T]): List[(T, Int)] = {
		// pack(xs) map (list => (list(0), list.length)) // or better written as
		pack(xs) map (ys => (ys.head, ys.length))
  };System.out.println("""encode: [T](xs: List[T])List[(T, Int)]""");$skip(53); val res$1 = 
  
  encode(List("a", "a", "a", "b", "c", "c", "a"));System.out.println("""res1: List[(String, Int)] = """ + $show(res$1))}

}
