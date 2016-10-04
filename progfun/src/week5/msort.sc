package week5

object msort {
	
	def msort(xs: List[Int]): List[Int] = {
		val n = xs.length/2
		if (n == 0) xs
		else {
			val (fst, snd) = xs splitAt n
			merge(msort(fst), msort(snd))
		}
	}                                         //> msort: (xs: List[Int])List[Int]
	
	def merge(xs: List[Int], ys: List[Int]): List[Int] = (xs, ys) match {
		case (Nil, ys) => ys
		case (xs, Nil) => xs
		case (x :: xs1, y :: ys1) =>
			if (x < y) x :: merge(xs1, ys)
			else y :: merge(xs, ys1)
	}                                         //> merge: (xs: List[Int], ys: List[Int])List[Int]
	
	msort(List(5, 2, -1, 6, 9, 2))            //> res0: List[Int] = List(-1, 2, 2, 5, 6, 9)
}