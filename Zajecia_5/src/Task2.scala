object Task2 {

  class EquationSolver() {
    var result = 0.0

    override def toString() = s"Result $result"

    def <<(x: Any): EquationSolver = {
      x match {
        case Addition(x: Double) => {
          result = result + x
          println("Adding " + x)
          return this
        }
        case Subtraction(x: Double) => {
          result = result - x
          println("Subtracting " + x)
          return this
        }
        case Division(x: Double) => {
          if (x == 0) {
            println("Unknow / not allowed operation")
            return this
          }
          else {
            result = result / x
            println("Deviding by " + x)
            return this
          }
        }
        case Multiplication(x: Double) => {
          result = result * x
          println("Multiplying by " + x)
          return this
        }
        case _ => {
          println("Unknow / not allowed operation")
          return this
        }

      }
    }
  }





  case class Addition(x:Double)
  case class Subtraction(x:Double)
  case class Division(x:Double)
  case class Multiplication(x:Double )

  def main(args: Array[String]) = {

    val s = new EquationSolver()
    println(s)
    s << Addition(1) << Subtraction(1)
    println(s)
    s << Division(0)
    println(s)
    s << Addition(1) << Multiplication(5)
    println(s)
    s << Division(2)
    println(s)
    s << List[Int](1)
    println(s)
  }

}
