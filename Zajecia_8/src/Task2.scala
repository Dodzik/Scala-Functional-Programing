import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent._
import scala.concurrent.duration._
import scala.util._
import math.{ min, max }

object Task2 {
  def mapReduce(s: List[Int]): Future[(Int, Int)] = {
    val splitted = s.grouped(s.length / 10).toSeq // This splits list of Numbers into 10 sequences of numbers - it's first point from plan

    // TODO: Create sequence of features for each chunk, where each future will find tuple of (min, max) inside single chunk (map).

    val dummy:Future[Seq[(Int,Int)]]={
      Future((splitted.map(i=>i.foldLeft(i.head,i.head){case ((min,max),b) =>(math.min(min,b),math.max(max,b))})))
    }
    
    dummy.map(a=>a.reduce((x,y)=>(min(x._1,y._1),max(x._2,y._2))))

    // TODO: Combine results of all chunks to single tuple (min, max) - (reduce).
  }

  def main(args: Array[String]): Unit = {
    val rNumbers = List.fill(100)(Random.nextInt())

//    val splitted = rNumbers.grouped(rNumbers.length / 10).toSeq
//    println(splitted)
//
//    val dummy:Future[Seq[(Int,Int)]]={
//      Future((splitted.map(i=>i.foldLeft(0,0) { case ((min, max), q) => (math.min(min, q), math.max(max, q))})))
//    }



     println((rNumbers.min, rNumbers.max)) // You can check if the result is correct
    val r = mapReduce(rNumbers)

    r onComplete {
      case Success(res) => println(res) // Should be tuple: (MinNumber, MaxNumber)
    }

    Await.ready(r, Duration(10, SECONDS))
  }
}
