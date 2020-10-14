object Szczurek {
  def main(args: Array[String]): Unit = {
    println("Hello im RAAAAAAAAAT!!" + "\n" + "Do you have cheeessseee????????")
    var x = Array(1, 2, 3)
    x(0) = 5

    println(f"kraaa " + x(0) + "     " + x.apply(1))
    println("____________++++++++++++++++_______________")
    val person = ("Ewa", "Xin", 29)
    val (name, family, age) = person
    println("Test person name: " + person._1 + "  " + person._3)
    println("____________++++++++++++++++_______________")
    val list = List("Alice", 2, 33, 3)
    println("Test list: " + list.apply(0) + " ||| " + list(0))
    println(list.contains(2) + " |||||  " + 1 :: list)
    //list(2) <- list.apply(1)+list.apply(3)
    var list2 = List.fill(4)(7)
    // 2 :: list2 = 1 :: list2 + 3 ::list2
    println(list2(2))
    println("____________++++++++++++++++_______________")
    val q = 8
    val z = if (q < 0) 0.1 else q
    println("wartosc z: " + z)
    println("____________++++++++++++++++_______________")
    val p = List(1, 2, 3, 4, 5, 6, 7)
    for (e <- x) {
      println(e)
    }
    println("____________++++++++++++++++_______________")
    println("Multi loop test : ")
    for (v <- 1 to 3; b <- 1 to 3; n <- 1 to 3) {
      println(v + " " + b + " " + n)
    }
    println("____________++++++++++++++++_______________")
    val g = for {o <- 1 to 20 if o % 3 == 0} yield o
    println(g.toList + "dupa")
    println(g)
    println("____________++++++++++++++++_______________")

    def sq(x: Int): Int = {
      return x * x
    }
//    def sq(x: Int): Int = {
//      return x * x
//    }
//    def sq(x: Int): Int = {
//       x * x;
//    }
    //def sq(x: Int): Int =x*x
    println(sq(3))
    println("____________++++++++++++++++_______________")
    def no1 = {
      println("n1")
    }
    def no2()={
      println("n2")
    }
    no1
    //no1()   ERROR
    no2
    no2()
    println("____________++++++++++++++++_______________")

    def fun1(i: Int,j :Int)=i+j
    def fun2(i: Int)(j :Int)=i+j

    println("Testing different declaroation: " +fun1(1,5)+"  "+ fun2(1)(5))
    //def sod1(i: Int,j :Int = i+1)=i+j ERROR
    def sod2(i: Int)(j :Int = i+6)=i+j
    // nie mam pojecia do czego to sie możee przydać
    def f(x:Int) = println(x)
    //jedna f
    0 to 10 foreach( (x:Int) => print(x))
    println()
    0 to 10 foreach( x=>print(x))
    println()
    0 to 10 foreach( x=>print(sq(x)))
  }
}
