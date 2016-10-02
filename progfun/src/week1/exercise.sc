package week1

object exercise {
	def factorial(n: Int): Int = {
		def loop(acc: Int, n: Int): Int =
			if (n == 0) acc
			else loop(acc * n, n - 1)
		loop(1, n)
	}                                         //> factorial: (n: Int)Int
	
	factorial(3)                              //> res0: Int = 6
	factorial(4)                              //> res1: Int = 24
}