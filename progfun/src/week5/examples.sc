package week5

object examples {
	val pair = ("answer", 42)                 //> pair  : (String, Int) = (answer,42)
	val (label, value) = pair                 //> label  : String = answer
                                                  //| value  : Int = 42
 	pair._1                                   //> res0: String = answer
}