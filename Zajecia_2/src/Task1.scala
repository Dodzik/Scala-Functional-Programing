object Task1 {
  def main(args: Array[String]): Unit = {

    if (args.length == 2) {
    if (args(0)(0).isLetter && args(1)(0).isLetter) {
//      var one = args(0)(0)
//      var two = args(1)(0)
//      if (two>one){
//        var a=one
//        one=two
//        two=a
//      }
//      val chars = one to two
//      println(chars)
//      chars.foreach(a => println(a))
        if (args(0)(0).toLower < args(1)(0).toLower) {
          val one = args(0)(0)
          val two = args(1)(0)
          val chars = one to two
          println(chars)
          chars.foreach(a => print(a))
        }
        else {
          val two = args(0)(0)
          val one = args(1)(0)
          val chars = one to two
          chars.foreach(a => print(a))

        }
      }
      else {
        println("ERROR: pls enter 2 letters ")
      }
    }
    else{
      println("ERROR: pls enter 2 letters ")
    }
  }
}

