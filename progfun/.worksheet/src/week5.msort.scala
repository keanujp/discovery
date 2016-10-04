package week5

object msort {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(193); 
	
	def msort(xs: List[Int]): List[Int] = {
		val n = xs.length/2
		if (n == 0) xs
		else {
			val (fst, snd) = xs splitAt n
			merge(msort(fst), msort(snd))
		}
	};System.out.println("""msort: (xs: List[Int])List[Int]""");$skip(215); 
	
	def merge(xs: List[Int], ys: List[Int]): List[Int] = (xs, ys) match {
		case (Nil, ys) => ys
		case (xs, Nil) => xs
		case (x :: xs1, y :: ys1) =>
			if (x < y) x :: merge(xs1, ys)
			else y :: merge(xs, ys1)
	};System.out.println("""merge: (xs: List[Int], ys: List[Int])List[Int]""");$skip(34); val res$0 = 
	
	msort(List(5, 2, -1, 6, 9, 2));System.out.println("""res0: List[Int] = """ + $show(res$0))}
}
