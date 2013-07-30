package week6

class PolyFoldleft(val terms0: Map[Int, Double]) {

  def this(bindings: (Int, Double)*) = this(bindings.toMap)

  val terms = terms0 withDefaultValue 0.0

  def +(other: PolyFoldleft) = {
    new PolyFoldleft((other.terms foldLeft terms)(addTerm))
  }
  
  def addTerm(terms: Map [Int, Double], term : (Int, Double)):Map [Int, Double] ={
    val (exp, coeff)= term
    terms + (exp -> (coeff + terms(exp)))
  }

  override def toString = {
    (for ((exp, coeff) <- terms.toList.sorted.reverse) yield coeff + "x^" + exp) mkString " + "
  }

}