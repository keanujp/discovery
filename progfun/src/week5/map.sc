package week5

object map {
	def squareList(xs: List[Int]): List[Int] =
		xs match {
			case Nil => Nil
			case y :: ys => (y * y) :: squareList(ys)
		}                                 //> squareList: (xs: List[Int])List[Int]
	
	def squareListWithMap(xs: List[Int]): List[Int] =
		xs map (x => x * x)               //> squareListWithMap: (xs: List[Int])List[Int]
		
		
	val nums = List(1,2,3,4)                  //> nums  : List[Int] = List(1, 2, 3, 4)
	squareList(nums)                          //> res0: List[Int] = List(1, 4, 9, 16)
	squareListWithMap(nums)                   //> res1: List[Int] = List(1, 4, 9, 16)
}