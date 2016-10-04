package week5

object fold {
	def lengthFun[T](xs: List[T]): Int =
		(xs foldRight 0)((_, x) => x + 1) //> lengthFun: [T](xs: List[T])Int
		
	def mapFun[T, U](xs: List[T], f: T => U): List[U] =
		//(xs foldRight List[U]())((x, y) => f(x) :: y)
		(xs foldRight List[U]())(f(_) :: _)
                                                  //> mapFun: [T, U](xs: List[T], f: T => U)List[U]

	val nums = List(1, 2, 3, 4, 5)            //> nums  : List[Int] = List(1, 2, 3, 4, 5)
	lengthFun(nums)                           //> res0: Int = 5
	mapFun[Int, Int](nums, x => x + 1)        //> res1: List[Int] = List(2, 3, 4, 5, 6)
}