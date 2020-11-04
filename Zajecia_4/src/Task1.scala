class SDistance(k: Int, m: Int, c: Int) {
  val ki = k
  val me = m
  val ce = c

  override def toString: String = {
    s"Kilometers: ${k} Meters : ${m} , Centimeters:  ${c}"
  }

  def len(): Int = ki * 100000 + me * 100 + ce

  def ==(dummy: SDistance): Boolean = {
    this.len==dummy.len
//    val s1 = this.len
//    val s2 = dummy.len
//    if (this.len == s2) {
//      true
//    }
//    else false
  }

  def !=(dummy: SDistance): Boolean = ! ==(dummy)

  def >(dummy: SDistance): Boolean = {
    val s1 = this.len
    val s2 = dummy.len
    if (s1 > s2) {
      true
    }
    else false
  }

  def <(dummy: SDistance): Boolean = {
    val s1 = this.len
    val s2 = dummy.len
    if (s1 < s2) {
      true
    }
    else false
  }

  def add(a: Int, vv: SDistance.Value): SDistance = {
    if (vv == SDistance.ki) {
      SDistance.apply(ki + a, me, ce)
    }
    else if (vv == SDistance.me) {
      SDistance.apply(ki, me + a, ce)
    }
    else {
      SDistance.apply(ki, me, ce + a)
    }
  }


}

object SDistance extends Enumeration {
  val ki, me, ce = Value

  def apply(k: Int, m: Int, c: Int): SDistance = {
    new SDistance(k, m, c)
  }


}

object Task1 {
  def main(args: Array[String]): Unit = {
    val firstDistance = SDistance(2, 2, 2)
    val secondDistance = SDistance(2, 2, 2)
    val thirdDistance = SDistance(2, 2, 3)
    val fourthDistance = SDistance(2, 2, 1)

    println("Distances:")
    println(firstDistance) // Kilometers: 2, Meters : 2, Centimeters: 2
    println(secondDistance) // Kilometers: 2, Meters : 2, Centimeters: 2
    println(thirdDistance) // Kilometers: 2, Meters : 2, Centimeters: 3
    println(fourthDistance) // Kilometers: 2, Meters : 2, Centimeters: 1

    println("2:")
    println(firstDistance == secondDistance) // true
    println(firstDistance != secondDistance) // false
    println(firstDistance > secondDistance) // false
    println(firstDistance < secondDistance) // false

    println("3:")
    println(firstDistance == thirdDistance) // false
    println(firstDistance != thirdDistance) // true
    println(firstDistance > thirdDistance) // false
    println(firstDistance < thirdDistance) // true

    println("4:")
    println(firstDistance == fourthDistance) // false
    println(firstDistance != fourthDistance) // true
    println(firstDistance > fourthDistance) // true
    println(firstDistance < fourthDistance) // false

    val fifthDistance = firstDistance.add(2, SDistance.ki) // here you have to be able to add also meters or centimeters
    println(fifthDistance) // Kilometers: 4, Meters: 2, Centimeters: 2
  }
}
