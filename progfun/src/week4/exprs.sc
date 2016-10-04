package week4

object exprs {
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
	}                                         //> show: (e: week4.Expr)String
	
	show(Sum(Number(1), Number(44)))          //> res0: String = 1 + 44
	show(Sum(Prod(Number(2), Var("x")), Var("y")))
                                                  //> res1: String = 2 * x + y
	show(Prod(Sum(Number(2), Var("x")), Var("y")))
                                                  //> res2: String = (2 + x) * y
	show(Prod(Var("x"), Sum(Number(2), Var("y"))))
                                                  //> res3: String = x * (2 + y)
}