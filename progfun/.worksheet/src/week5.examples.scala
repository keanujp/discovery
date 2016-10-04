package week5

object examples {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(59); 
	val pair = ("answer", 42);System.out.println("""pair  : (String, Int) = """ + $show(pair ));$skip(27); 
	val (label, value) = pair;System.out.println("""label  : String = """ + $show(label ));System.out.println("""value  : Int = """ + $show(value ));$skip(10); val res$0 = 
 	pair._1;System.out.println("""res0: String = """ + $show(res$0))}
}
