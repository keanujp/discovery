package week5

object remove {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(187); 
	def removeAt[T](n: Int, xs: List[T]): List[T] = xs match {
		case List() => List()
		case y :: ys  =>
			if (n == 0) ys
			else y :: removeAt(n - 1, ys)
	};System.out.println("""removeAt: [T](n: Int, xs: List[T])List[T]""");$skip(40); val res$0 = 

	removeAt(1, List('a', 'b', 'c', 'd'));System.out.println("""res0: List[Char] = """ + $show(res$0));$skip(74); 

	def removeAt2[T](n: Int, xs: List[T]) = (xs take n) ::: xs drop (n + 1);System.out.println("""removeAt2: [T](n: Int, xs: List[T])List[T]""");$skip(40); val res$1 = 
	removeAt2(1, List('a', 'b', 'c', 'd'));System.out.println("""res1: List[Char] = """ + $show(res$1))}
}
