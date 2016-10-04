package week4

object exprs {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(370); 
	def show(e: Expr): String = e match {
		case Number(x) => x.toString
		case Var(x) => x
		case Sum(l, r) => show(l) + " + " + show(r)
		case Prod(l, r) => (l match {
			case Sum(l, r) => "(" + show(Sum(l, r)) + ")"
			case _ => show(l)
		}) + " * " + (r match {
			case Sum(l, r) => "(" + show(Sum(l, r)) + ")"
			case _ => show(r)
		})
	};System.out.println("""show: (e: week4.Expr)String""");$skip(36); val res$0 = 
	
	show(Sum(Number(1), Number(44)));System.out.println("""res0: String = """ + $show(res$0));$skip(48); val res$1 = 
	show(Sum(Prod(Number(2), Var("x")), Var("y")));System.out.println("""res1: String = """ + $show(res$1));$skip(48); val res$2 = 
	show(Prod(Sum(Number(2), Var("x")), Var("y")));System.out.println("""res2: String = """ + $show(res$2));$skip(48); val res$3 = 
	show(Prod(Var("x"), Sum(Number(2), Var("y"))));System.out.println("""res3: String = """ + $show(res$3))}
}
