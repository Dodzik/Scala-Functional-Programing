import scala.annotation.tailrec

object Task1 {



  def partition2(list: List[Int], predicate: Int => Boolean): List[List[Int]] ={
    var list_t = List[Int]()
    var list_f = List[Int]()
    partition(list,predicate)
      @scala.annotation.tailrec
      def partition(list: List[Int], predicate: Int => Boolean){

      if (list.isEmpty) {
        return
      }

      if (predicate(list.head)) {
        list_t = list_t :+ list.head

      }
      else {

        list_f = list_f :+ list.head
      }
      partition(list.tail, predicate)
    }
    List(list_t,list_f)
  }
  def main(args: Array[String]): Unit = {
//    val list= List(1,2,3,4,5,6,7,8,9,10)
//    var list4=List(List[Int](),List[Int]())
    println(partition2(list=List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), predicate=_ % 2 == 0))

  }

}
