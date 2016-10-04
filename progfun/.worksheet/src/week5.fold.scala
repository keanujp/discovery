package week5

object fold {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(102); 
	def lengthFun[T](xs: List[T]): Int =
		(xs foldRight 0)((_, x) => x + 1);System.out.println("""lengthFun: [T](xs: List[T])Int""");$skip(144); 
		
	def mapFun[T, U](xs: List[T], f: T => U): List[U] =
		//(xs foldRight List[U]())((x, y) => f(x) :: y)
		(xs foldRight List[U]())(f(_) :: _);System.out.println("""mapFun: [T, U](xs: List[T], f: T => U)List[U]""");$skip(33); 

	val nums = List(1, 2, 3, 4, 5);System.out.println("""nums  : List[Int] = """ + $show(nums ));$skip(17); val res$0 = 
	lengthFun(nums);System.out.println("""res0: Int = """ + $show(res$0));$skip(36); val res$1 = 
	mapFun[Int, Int](nums, x => x + 1);System.out.println("""res1: List[Int] = """ + $show(res$1))}
}
