package week3
import week3._

object nth {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(283); 
  def nth[T](n: Int, list: List[T]): T = {
    def loop(i: Int, list: List[T]): T = {
      if (list.isEmpty) throw new IndexOutOfBoundsException
      else if (i == n) list.head
      else loop(i + 1, list.tail)
    }
    loop(0, list)
  };System.out.println("""nth: [T](n: Int, list: week3.List[T])T""");$skip(63); 
  
  val list = new Cons(1, new Cons(2, new Cons(3, new Nil)));System.out.println("""list  : week3.Cons[Int] = """ + $show(list ));$skip(15); val res$0 = 
  nth(2, list);System.out.println("""res0: Int = """ + $show(res$0));$skip(15); val res$1 = 
  nth(4, list);System.out.println("""res1: Int = """ + $show(res$1))}
}
