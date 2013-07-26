object session extends Application {

  def sqrt(x: Double): Double = {

    def abs(x: Double) = if (x < 0) -x else x

    def sqrtIter(guess: Double): Double = {
      if (isGoodEnough(guess)) guess
      else sqrtIter(improve(guess))
    }

    def isGoodEnough(guess: Double) = {
      abs(guess * guess - x) < 0.001
    }

    def improve(guess: Double): Double = {
      (guess + x / guess) / 2
    }

    sqrtIter(1.0)
  }

  val sqrtVal = sqrt(2) 	
  println("hello" + sqrtVal)
}