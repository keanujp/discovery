package week5

object remove {
	def removeAt[T](n: Int, xs: List[T]): List[T] = xs match {
		case List() => List()
		case y :: ys  =>
			if (n == 0) ys
			else y :: removeAt(n - 1, ys)
	}                                         //> removeAt: [T](n: Int, xs: List[T])List[T]

	removeAt(1, List('a', 'b', 'c', 'd'))     //> res0: List[Char] = List(a, c, d)

	def removeAt2[T](n: Int, xs: List[T]) = (xs take n) ::: xs drop (n + 1)
                                                  //> removeAt2: [T](n: Int, xs: List[T])List[T]
	removeAt2(1, List('a', 'b', 'c', 'd'))    //> res1: List[Char] = List(b, c, d)
}