package week3
import week3._

object nth {
  def nth[T](n: Int, list: List[T]): T = {
    def loop(i: Int, list: List[T]): T = {
      if (list.isEmpty) throw new IndexOutOfBoundsException
      else if (i == n) list.head
      else loop(i + 1, list.tail)
    }
    loop(0, list)
  }                                               //> nth: [T](n: Int, list: week3.List[T])T
  
  val list = new Cons(1, new Cons(2, new Cons(3, new Nil)))
                                                  //> list  : week3.Cons[Int] = week3.Cons@34ce8af7
  nth(2, list)                                    //> res0: Int = 3
  nth(4, list)                                    //> java.lang.IndexOutOfBoundsException
                                                  //| 	at week3.nth$$anonfun$main$1.loop$1(week3.nth.scala:7)
                                                  //| 	at week3.nth$$anonfun$main$1.nth$1(week3.nth.scala:11)
                                                  //| 	at week3.nth$$anonfun$main$1.apply$mcV$sp(week3.nth.scala:16)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$$anonfun$$exe
                                                  //| cute$1.apply$mcV$sp(WorksheetSupport.scala:76)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$.redirected(W
                                                  //| orksheetSupport.scala:65)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$.$execute(Wor
                                                  //| ksheetSupport.scala:75)
                                                  //| 	at week3.nth$.main(week3.nth.scala:4)
                                                  //| 	at week3.nth.main(week3.nth.scala)
}