package week4

object rationals {

  val x = new Rational(1, 3)                      //> x  : week4.Rational = 1/3
  val y = new Rational(5, 7)                      //> y  : week4.Rational = 5/7
  val z = new Rational(3, 2)                      //> z  : week4.Rational = 3/2

  x.numer                                         //> res0: Int = 1
  x.denom                                         //> res1: Int = 3
  x.add(y)                                        //> res2: week4.Rational = 22/21
  x.neg                                           //> res3: week4.Rational = 1/-3
  x                                               //> res4: week4.Rational = 1/3
  x.sub(y)                                        //> res5: week4.Rational = 8/-21
  y.add(y)                                        //> res6: week4.Rational = 10/7
  x.max(y)                                        //> res7: week4.Rational = 5/7

  val strange = new Rational(1, 1)                //> strange  : week4.Rational = 1/1
  new Rational(2)                                 //> res8: week4.Rational = 2/1
  
  println(x - y)                                  //> 8/-21
  
  println(-x)                                     //> 1/-3
  
}

class Rational(x: Int, y: Int) {

  def - (that: Rational) = {

    this.add(that.neg)

  }
  
  def unary_- :Rational = new Rational (-numer, denom)
  
  def toString1 = numer + "/" + denom

  override def toString = numer + "/" + denom

  require(y != 0, "denominator must be non zero")

  def this(x: Int) = this(x, 1)

  def max(that: Rational) =
    if (this.less(that)) that else this

  private def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)

  private val g = gcd(x, y)

  val numer = x / g
  val denom = y / g

  def add(that: Rational) = {
    new Rational(
      numer * that.denom + that.numer * denom,
      denom * that.denom)
  }

  def neg: Rational = {
    new Rational(-numer, denom)
  }

  def sub(a: Rational) = {
    add(a.neg)
  }

  def less(that: Rational) = numer * that.denom < that.numer * denom

}