package week5

object pack {
  def pack[T](xs: List[T]): List[List[T]] = xs match {
    case Nil => Nil
    case x :: xs1 =>
      val (first, rest) = xs span (s => s == x)
      first :: pack(rest)
  }                                               //> pack: [T](xs: List[T])List[List[T]]

  pack(List("a", "a", "a", "b", "c", "c", "a"))   //> res0: List[List[String]] = List(List(a, a, a), List(b), List(c, c), List(a))
                                                  //| 

  def encode[T](xs: List[T]): List[(T, Int)] = {
		// pack(xs) map (list => (list(0), list.length)) // or better written as
		pack(xs) map (ys => (ys.head, ys.length))
  }                                               //> encode: [T](xs: List[T])List[(T, Int)]
  
  encode(List("a", "a", "a", "b", "c", "c", "a")) //> res1: List[(String, Int)] = List((a,3), (b,1), (c,2), (a,1))

}