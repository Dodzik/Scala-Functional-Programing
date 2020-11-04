import scala.math.sqrt

trait HumanComparator {
  def dist: Double

  def rightWhereYouAre(): Boolean = {
    dist == 0
  }

  def inYourNeighborhood(): Boolean = {
    dist > 0.0 && dist < 10.0
  }

  def farAway(): Boolean = {
    dist > 10.0
  }

  def toHuman(): String = {
    if (rightWhereYouAre) {
      "Right where you are"
    }
    else if (inYourNeighborhood) {
      "In your neighborhood"
    }
    else
      "Far awayyyyyyyyyyyyyyyyyyyyyyyyy"
  }
}

class Formatted(v: Double)extends HumanComparator {
  def dist: Double = v
}

class TDistance(tuple: (Int, Int), tuple1: (Int, Int)) {
  def dist: Double = sqrt((tuple1._1 - tuple._1) ^ 2 + (tuple1._2 - tuple._2) ^ 2)
}

object Task2 {
  def main(args: Array[String]): Unit = {
    val x = new Formatted(0.0)
    println(x.toHuman) // Right where you are

    val y = new Formatted(5.0)
    println(y.toHuman) // In your neighborhood

    val z = new Formatted(25.0)
    println(z.toHuman) // Far away
    println(f"${z.rightWhereYouAre()} ${z.inYourNeighborhood()} ${z.farAway()}") // false false true

    val dist = new TDistance((1, 1), (4, 4)) with HumanComparator
    println(dist.toHuman) // In your neighborhood
  }
}
