package week5

object map {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(152); 
	def squareList(xs: List[Int]): List[Int] =
		xs match {
			case Nil => Nil
			case y :: ys => (y * y) :: squareList(ys)
		};System.out.println("""squareList: (xs: List[Int])List[Int]""");$skip(75); 
	
	def squareListWithMap(xs: List[Int]): List[Int] =
		xs map (x => x * x);System.out.println("""squareListWithMap: (xs: List[Int])List[Int]""");$skip(32); 
		
		
	val nums = List(1,2,3,4);System.out.println("""nums  : List[Int] = """ + $show(nums ));$skip(18); val res$0 = 
	squareList(nums);System.out.println("""res0: List[Int] = """ + $show(res$0));$skip(25); val res$1 = 
	squareListWithMap(nums);System.out.println("""res1: List[Int] = """ + $show(res$1))}
}
