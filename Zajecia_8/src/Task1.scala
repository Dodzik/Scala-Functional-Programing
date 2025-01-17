
import math.{ min, max }

object Task1 {

  def unique(list: List[Int]): List[Int] ={

   list.groupBy(x=>x).map{ case(num, x) => (num, x.size) }.filter(_._2==1).keys.toList


  }
  def mergePairs(a:List[Int],b:List[Int],fun:( (Int,Int))=>Int):List[Int]={
    (a zip b ).map(fun)
  }

  def main(args: Array[String]): Unit = {
    val list1=List(1, 1, 5, 6, 3, 5, 8, 9, 10, 8)

    println(unique(list1))

    println(mergePairs(List(1, 5, 9, 10), List(0, 4, 10, 11), x => max(x._1, x._2)))

    println(mergePairs(List(1, 5, 9, 11), List(0, 4, 10, 8), x => min(x._1, x._2)))

  }
}
