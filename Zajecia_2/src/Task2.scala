import scala.::

object Task2 {

  def main(args: Array[String]): Unit = {

    val rect1 = (4.0,5.0)
    val rect2 = (1.0,6.0)
    val rect3 = (7.0,4.0)
    val list2 = List(rect1,rect2,rect3)
    println(list2)

    val list1 = rect1 :: rect2 :: rect3::Nil
   println(list1)

    val list3= Nil:::list2
    println(list3)

    val area =10

    def fun2(q: Double,p: Double) = q*p


    list2.foreach(a => println("("+a._1+","+a._2+") => area: "+fun2(a._1,a._2)) )

    def fun3 (list :List[(Double,Double)] ,ctr:Int){
      println("Biegger than area: "+ctr)
      list.foreach(a =>
        if (a._1*a._2>ctr) println("("+a._1+", "+a._2+")")
      )
    }

    fun3(list3,area)
  }

}
